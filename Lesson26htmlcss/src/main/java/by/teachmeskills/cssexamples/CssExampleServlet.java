package by.teachmeskills.cssexamples;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cssexample")
public class CssExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        RequestDispatcher rd = req.getRequestDispatcher("cssexample1.html");
//        RequestDispatcher rd = req.getRequestDispatcher("padding.html");
        RequestDispatcher rd = req.getRequestDispatcher("ulol.html");
        rd.forward(req, resp);
    }
}
