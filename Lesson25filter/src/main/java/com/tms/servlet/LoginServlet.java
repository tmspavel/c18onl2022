package com.tms.servlet;

import com.tms.model.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/login", name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        HttpSession session = req.getSession();
        session.setAttribute("email", email);
        session.setAttribute("pass", pass);

        resp.sendRedirect("/home");
//        System.out.println(email + " "+ pass);
//        resp.setContentType("text/plain");
//        if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
//            resp.getWriter().write("Success logged!!");
//        } else {
//            resp.getWriter().println("Параметры не корректные!");
//        }

    }
}