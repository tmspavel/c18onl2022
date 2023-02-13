package com.example.Lesson28dop;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/info")
public class InfoServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String text = getInfo();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>" + text + "</p>");
        out.println("</body></html>");
    }

    private String getInfo() {
        try {
            return new String(getServletContext().getResourceAsStream("/WEB-INF/classes/text.txt").readAllBytes());
        } catch (IOException e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
        return null;
    }
}