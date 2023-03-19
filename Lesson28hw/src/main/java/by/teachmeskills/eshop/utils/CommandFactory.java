package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.controller.BaseController;
import by.teachmeskills.eshop.controller.HomeController;
import by.teachmeskills.eshop.controller.LogoutController;
import by.teachmeskills.eshop.model.Command;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class CommandFactory {

    private static final Map<String, BaseController> COMMANDS = new ConcurrentHashMap<>();

    public static BaseController defineCommand(Command command) {
        return putIfAbsent(command.getCommand(), createController(command));
    }

    private static Supplier<BaseController> createController(Command command) {
        return switch (command) {
            case SIGN_IN_COMMAND -> HomeController::new;
            case LOGOUT_COMMAND -> LogoutController::new;
        };
    }

    private static BaseController putIfAbsent(String key, Supplier<BaseController> supplier) {
        BaseController value = COMMANDS.get(key);
        if (value == null) {
            COMMANDS.put(key, value = supplier.get());
        }
        return value;
    }
}

