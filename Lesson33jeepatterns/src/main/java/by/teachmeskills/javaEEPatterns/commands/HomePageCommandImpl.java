package by.teachmeskills.javaEEPatterns.commands;

import by.teachmeskills.javaEEPatterns.exceptions.CommandException;
import by.teachmeskills.javaEEPatterns.model.PagesPath;
import javax.servlet.http.HttpServletRequest;

public class HomePageCommandImpl implements BaseCommand {

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        return PagesPath.HOME_PAGE.getPath();
    }
}

