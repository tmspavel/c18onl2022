package by.teachmeskills.loop;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/jstl")
public class JstlExampleServlet extends HttpServlet {

    //Loop example
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String[] usersNames = {"Alex", "John", "Todd"};
//        req.setAttribute("usersNames", usersNames);
//
////        resp.sendRedirect("/loop.jsp");
//        getServletContext().getRequestDispatcher("/loop.jsp").forward(req, resp);
//    }

    //If example
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("isVisible", true);
//        getServletContext().getRequestDispatcher("/if.jsp").forward(req, resp);
//    }

    //Choose example
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("val", 3);
//        getServletContext().getRequestDispatcher("/choose.jsp").forward(req, resp);
//    }

    //Url example
    /*Сохраняет указанный url в переменную в правильной кодировке, что является его единственным преимуществом.*/
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/url.jsp").forward(req, resp);
//    }

    //Redirect example
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("val", 1);
//        getServletContext().getRequestDispatcher("/redirect.jsp").forward(req, resp);
//    }

    //Catch example
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/catch.jsp").forward(req, resp);
//    }

    //Date formatting example
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setCharacterEncoding("UTF-8");
//        getServletContext().getRequestDispatcher("/dateformat.jsp").forward(req, resp);
//    }

    //Number format example
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/numberformat.jsp").forward(req, resp);
//    }
}
