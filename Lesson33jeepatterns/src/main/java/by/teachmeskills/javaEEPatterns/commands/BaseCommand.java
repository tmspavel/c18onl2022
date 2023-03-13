package by.teachmeskills.javaEEPatterns.commands;

import by.teachmeskills.javaEEPatterns.exceptions.CommandException;
import javax.servlet.http.HttpServletRequest;

public interface BaseCommand {

    String execute(HttpServletRequest request) throws CommandException;
}


