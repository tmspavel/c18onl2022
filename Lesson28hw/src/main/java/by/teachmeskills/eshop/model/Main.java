package by.teachmeskills.eshop.model;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        MyProduct product = MyProduct.of(1, "image", "name", "desc", BigDecimal.ONE, 1);
        System.out.println(product);

        Test test = new Test();

        for (Field declaredField : test.getClass().getDeclaredFields()) {
            Value valueAnnotation = declaredField.getAnnotation(Value.class);
            if (valueAnnotation != null) {
                declaredField.setAccessible(true);
                declaredField.set(test, valueAnnotation.value());
            }
        }
        System.out.println(test);

        Test test2 = new Test();
        System.out.println(test2);
    }

}
