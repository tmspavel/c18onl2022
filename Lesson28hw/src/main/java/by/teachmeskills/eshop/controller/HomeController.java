package by.teachmeskills.eshop.controller;

import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParamNotNull;
import static by.teachmeskills.eshop.utils.Utils.ADMIN_LOGIN;
import static by.teachmeskills.eshop.utils.Utils.ADMIN_PASSWORD;
import static by.teachmeskills.eshop.utils.Utils.isUserLogIn;

import by.teachmeskills.eshop.model.Cart;
import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.model.User;
import by.teachmeskills.eshop.service.CategoryService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class HomeController implements BaseController {

    private final CategoryService categoryService = new CategoryService();

    @Override
    public String execute(HttpServletRequest request) throws Exception {
        if (request.getMethod().equalsIgnoreCase("GET")) {
            User user = (User) request.getSession().getAttribute("username");
            return checkReceivedUser(user, request);
        } else {
            String login = request.getParameter("username");
            String pass = request.getParameter("password");

            validateParamNotNull(login);
            validateParamNotNull(pass);
            User user = new User(ADMIN_LOGIN, ADMIN_PASSWORD);
            Cart cart = new Cart();
            request.getSession().setAttribute("cart", cart);
            request.getSession().setAttribute("username", user);
            return checkReceivedUser(user, request);
        }
    }

    private String checkReceivedUser(User user, HttpServletRequest request) {
        if (isUserLogIn(user)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            return "home.jsp";
        } else {
            return "signin.jsp";
        }
    }
}
