package by.teachmeskills.eshop.utils;

import by.teachmeskills.eshop.controller.BaseController;
import by.teachmeskills.eshop.controller.HomeController;
import by.teachmeskills.eshop.controller.LogoutController;
import by.teachmeskills.eshop.model.Command;
import by.teachmeskills.eshop.model.RequestParam;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public class CommandFactory {

    private static final Map<String, BaseController> COMMANDS = new HashMap<>();

    public static BaseController defineCommand(HttpServletRequest request) {
        String commandKey = request.getParameter(RequestParam.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = Command.SIGN_IN_COMMAND.getCommand();
        }
        return COMMANDS.putIfAbsent(commandKey, createController(Command.fromString(commandKey)));
    }

    private static BaseController createController(Command command) {
        return switch (command) {
            case SIGN_IN_COMMAND -> new HomeController();
            case LOGOUT_COMMAND -> new LogoutController();
        };
    }

}

