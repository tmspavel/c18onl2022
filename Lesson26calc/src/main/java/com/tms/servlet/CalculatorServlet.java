package com.tms.servlet;

import static com.tms.utils.Calculator.sum;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
            Double param1 = getValueFromRequest(request, "param1");
            Double param2 = getValueFromRequest(request, "param2");
            String operation = request.getParameter("operation");
            Double result = calculate(param1, param2, operation);
            println(response, "Результат операции: " + operation + " = " + result);
        } catch (NumberFormatException exception) {
            println(response, "Не верный формат значений");
        } catch (IllegalStateException exception2) {
            println(response, "Не верная операция");
        } catch (Exception exception) {
            println(response, exception.getMessage());
        }
    }

    private void println(HttpServletResponse response, String message) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(message);
    }

    private Double calculate(Double param1, Double param2, String operation) {
        return switch (operation) {
            case "sum" -> sum(param1, param2);
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }

    private Double getValueFromRequest(HttpServletRequest request, String parameterName) {
        String parameterValue = request.getParameter(parameterName);
        if (parameterValue == null) {
            throw new IllegalArgumentException(parameterName + " не задан");
        }
        return Double.valueOf(parameterValue);
    }
}