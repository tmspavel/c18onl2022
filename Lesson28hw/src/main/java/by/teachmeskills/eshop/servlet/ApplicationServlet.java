package by.teachmeskills.eshop.servlet;

import by.teachmeskills.eshop.controller.BaseController;
import by.teachmeskills.eshop.exceptions.ValidationException;
import by.teachmeskills.eshop.model.PagesPath;
import by.teachmeskills.eshop.utils.CommandFactory;
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
        BaseController baseController = CommandFactory.defineCommand(request);
        try {
            String path = baseController.execute(request);
            RequestDispatcher dispatcher = request.getRequestDispatcher(path);
            dispatcher.forward(request, response);
        } catch (ValidationException e) {
            //валидационная ошибка
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            логируем сообщение а потом должны перенаправить на страницу с ошибкой("Извините что-то поломалось!!!"),
            //https://blog.hubspot.com/marketing/http-500-internal-server-error
//            также можно конверсейшен в URL запроса поместить
            request.getRequestDispatcher(PagesPath.SIGN_IN_PAGE.getPath()).forward(request, response);
        }
    }
}



