//package by.teachmeskills.javaEEPatterns.controller;
//
//import by.teachmeskills.javaEEPatterns.commands.BaseCommand;
//import by.teachmeskills.javaEEPatterns.exceptions.CommandException;
//import java.io.IOException;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class HomeController implements BaseCommand {
//
//    ProductService productService = new ProductService(new ProductRepositoryImpl());
//
//    @Override
//    public String execute(HttpServletRequest request) throws CommandException {
//        if (request.getMethod().equalsIgnoreCase("GET")) {
//            return checkReceivedUser();
//        } else {
//            String login = request.getParameter("username");
//            String pass = request.getParameter("password");
//
//            validateParamNotNull(login);
//            validateParamNotNull(pass);
//            User user = new User(ADMIN_LOGIN, ADMIN_PASSWORD);
//            Cart cart = new Cart();
//            request.getSession().setAttribute("cart", cart);
//            request.getSession().setAttribute("username", user);
//            return checkReceivedUser(user, request, response);
//        }
//    }
//
//    private String checkReceivedUser(User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        if (isUserLogIn(user)) {
//            List<Category> categories = categoryService.getCategories();
//            request.setAttribute("categories", categories);
//            return "home.jsp";
//        } else {
//            return "signin.jsp";
//        }
//    }
//}
