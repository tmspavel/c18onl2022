package com.tms.servlet;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import com.tms.model.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        List<Student> students = new ArrayList<>();

        String name = req.getParameter("name");
        if (isNotBlank(name)) {
            System.out.println(name);
        }

        students.add(new Student(22, "Иван Иванов", "4 курс"));
        students.add(new Student(21, "Иван Семенов", "3 курс"));
        students.add(new Student(20, "Алекс", "2 курс"));
        students.add(new Student(19, "Петр", "1 курс"));
        students.add(new Student(18, "Иван", "1 курс"));
        students.add(new Student(18, "Иван", "1 курс"));
        students.add(new Student(18, "Иван", "1 курс"));

        req.setAttribute("data", students);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/students.jsp");
        requestDispatcher.forward(req, resp);
//        resp.sendRedirect("https://google.com");
    }
}