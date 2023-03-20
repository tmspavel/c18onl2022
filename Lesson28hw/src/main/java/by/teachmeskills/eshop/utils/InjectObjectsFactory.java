package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.model.Inject;
import by.teachmeskills.eshop.repository.CategoryRepository;
import by.teachmeskills.eshop.repository.ProductRepository;
import by.teachmeskills.eshop.repository.impl.ProductRepositoryImpl;
import by.teachmeskills.eshop.repository.impl.StaticCategoryRepositoryImpl;
import by.teachmeskills.eshop.service.CategoryService;
import by.teachmeskills.eshop.service.CategoryServiceImpl;
import by.teachmeskills.eshop.service.ProductService;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InjectObjectsFactory {

    private static final Map<Class<?>, Object> CLASS_OBJECT_MAP = new ConcurrentHashMap<>();

//    public static <T> void createServices(Object controller) throws IllegalAccessException {
//        for (Field field : controller.getClass().getDeclaredFields()) {
//            Inject fieldInject = field.getAnnotation(Inject.class);
//            if (fieldInject != null) {
//                Object service = putIfAbsent(field.getType());
//                field.setAccessible(true);
//                field.set(controller, service);
//            }
//        }
//    }

    public static void createAndInjectInstanses(Object controller) throws Exception {
        for (Field field : controller.getClass().getDeclaredFields()) {
            Inject fieldInject = field.getAnnotation(Inject.class);
            if (fieldInject != null) {
                Object service = putInstanceToMapIfAbsent(field.getType());
                Method injectMethod = getInjectMethod(controller, field.getType());
                injectMethod.invoke(controller, service);
                createAndInjectInstanses(service);//проблема зацикливания может быть
            }
        }
    }

    private static Method getInjectMethod(Object controller, Class<?> type) {
        for (Method declaredMethod : controller.getClass().getDeclaredMethods()) {
            boolean allMatch = Arrays.stream(declaredMethod.getParameterTypes())
                                     .allMatch(methodParameterTypeClass -> methodParameterTypeClass == type
                                             && declaredMethod.getReturnType() == Void.TYPE
                                             && declaredMethod.getName().startsWith("set"));
            if (allMatch) {
                return declaredMethod;
            }
        }
        throw new IllegalArgumentException("Can not find method with param " + type);
    }

    private static <T> Object putInstanceToMapIfAbsent(Class<T> serviceClass) {
        Object value = CLASS_OBJECT_MAP.get(serviceClass);
        if (value == null) {
            value = createInstance(serviceClass);
            CLASS_OBJECT_MAP.put(serviceClass, value);
        }
        return value;
    }

    private static <T> Object createInstance(Class<T> serviceClass) {
        if (CategoryService.class == serviceClass) {
            return new CategoryServiceImpl();
        } else if (CategoryRepository.class == serviceClass) {
            return new StaticCategoryRepositoryImpl();
        } else if (ProductService.class == serviceClass) {
            return new ProductService();
        } else if (ProductRepository.class == serviceClass) {
            return new ProductRepositoryImpl();
        }
        throw new IllegalArgumentException("Can not create instance of class " + serviceClass);
    }
}

