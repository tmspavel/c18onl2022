package by.teachmeskills.javaEEPatterns.servlet;

import by.teachmeskills.javaEEPatterns.commands.BaseCommand;
import by.teachmeskills.javaEEPatterns.exceptions.CommandException;
import by.teachmeskills.javaEEPatterns.model.PagesPath;
import by.teachmeskills.javaEEPatterns.utils.CommandFactory;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/eshop")
public class ApplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BaseCommand requestCommand = CommandFactory.defineCommand(request);
        String path;
        try {
            path = requestCommand.execute(request);
            RequestDispatcher dispatcher = request.getRequestDispatcher(path);
            dispatcher.forward(request, response);
        } catch (CommandException e) {
            request.getRequestDispatcher(PagesPath.SIGN_IN_PAGE.getPath()).forward(request, response);
        }
    }
}



