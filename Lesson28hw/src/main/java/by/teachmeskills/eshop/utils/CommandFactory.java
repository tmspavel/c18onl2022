package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.controller.BaseController;
import by.teachmeskills.eshop.controller.HomeController;
import by.teachmeskills.eshop.controller.LogoutController;
import by.teachmeskills.eshop.model.Command;
import by.teachmeskills.eshop.model.RequestParam;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import javax.servlet.http.HttpServletRequest;

public class CommandFactory {

    private static final Map<String, BaseController> COMMANDS = new ConcurrentHashMap<>();

    public static BaseController defineCommand(HttpServletRequest request) {
        String commandKey = request.getParameter(RequestParam.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = Command.SIGN_IN_COMMAND.getCommand();
        }
        return putIfAbsent(commandKey, createController(Command.fromString(commandKey)));
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

