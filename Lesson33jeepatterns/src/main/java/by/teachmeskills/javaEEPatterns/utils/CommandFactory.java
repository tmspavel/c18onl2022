package by.teachmeskills.javaEEPatterns.utils;

import by.teachmeskills.javaEEPatterns.commands.BaseCommand;
import by.teachmeskills.javaEEPatterns.commands.HomePageCommandImpl;
import by.teachmeskills.javaEEPatterns.controller.HomeController;
import by.teachmeskills.javaEEPatterns.model.Commands;
import by.teachmeskills.javaEEPatterns.model.RequestParams;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public class CommandFactory {

    private static final Map<String, BaseCommand> COMMAND_LIST = new HashMap<>();

    static {
        COMMAND_LIST.put(Commands.HOME_PAGE_COMMAND.getCommand(), new HomePageCommandImpl());
//        COMMAND_LIST.put(Commands.SIGN_IN_COMMAND.getCommand(), new SignInCommandImpl());
        COMMAND_LIST.put(Commands.SIGN_IN_COMMAND.getCommand(), new HomeController());

    }

    public static BaseCommand defineCommand(HttpServletRequest request) {
        String commandKey = request.getParameter(RequestParams.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = Commands.SIGN_IN_COMMAND.getCommand();
        }
        return COMMAND_LIST.get(commandKey);
    }

}

