//package by.teachmeskills.eshop.utils;
//
//import static by.teachmeskills.eshop.utils.InjectObjectsFactory.createAndInjectInstanses;
//
//import by.teachmeskills.eshop.controller.BaseCommandController;
//import by.teachmeskills.eshop.controller.HomeController;
//import by.teachmeskills.eshop.controller.LogoutController;
//import by.teachmeskills.eshop.controller.ProductController;
//import by.teachmeskills.eshop.model.Command;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.function.Supplier;
//import lombok.experimental.UtilityClass;
//
//@UtilityClass
//public class CommandControllerFactory {
//
//    private static final Map<String, BaseCommandController> COMMANDS = new ConcurrentHashMap<>();
//
//    public static BaseCommandController defineCommand(Command command) throws Exception {
//        return putIfAbsent(command.getCommand(), createController(command));
//    }
//
//    private static Supplier<BaseCommandController> createController(Command command) {
//        return switch (command) {
//            case SIGN_IN_COMMAND -> HomeController::new;
//            case LOGOUT_COMMAND -> LogoutController::new;
//            case PRODUCT_COMMAND -> ProductController::new;
//        };
//    }
//
//    private static BaseCommandController putIfAbsent(String key, Supplier<BaseCommandController> supplier) throws Exception {
//        BaseCommandController value = COMMANDS.get(key);
//        if (value == null) {
//            value = create(supplier);
//            COMMANDS.put(key, value);
//        }
//        return value;
//    }
//
//    private static BaseCommandController create(Supplier<BaseCommandController> supplier) throws Exception {
//        BaseCommandController baseController = supplier.get();
//        createAndInjectInstanses(baseController);
//        return baseController;
//    }
//}
//
