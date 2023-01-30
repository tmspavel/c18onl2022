package com.tms.servlet;

import com.tms.model.Student;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(22, "Иван Иванов", "4 курс"));
        students.add(new Student(21, "Иван Семенов", "3 курс"));
        students.add(new Student(20, "Алекс", "2 курс"));
        students.add(new Student(19, "Петр", "1 курс"));

        req.setAttribute("data", students);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("students.jsp");
        requestDispatcher.forward(req, resp);
    }
}