package by.teachmeskills.eshop.controller;

import static by.teachmeskills.eshop.model.PagesPath.HOME_PAGE;
import static by.teachmeskills.eshop.model.PagesPath.SIGN_IN_PAGE;
import static by.teachmeskills.eshop.utils.Constants.SIGN_IN_COMMAND;
import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParam;
import static by.teachmeskills.eshop.utils.Utils.ADMIN_LOGIN;
import static by.teachmeskills.eshop.utils.Utils.ADMIN_PASSWORD;
import static by.teachmeskills.eshop.utils.Utils.isUserLogIn;

import by.teachmeskills.eshop.model.Cart;
import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.model.PagesPath;
import by.teachmeskills.eshop.model.User;
import by.teachmeskills.eshop.service.CategoryService;
import by.teachmeskills.eshop.service.ProductService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller(SIGN_IN_COMMAND)
@RequiredArgsConstructor
public class HomeController implements BaseCommandController {

    private final CategoryService categoryService;// = new CategoryServiceImpl();

    private final ProductService productService;

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        if (request.getMethod().equalsIgnoreCase("GET")) {
            User user = (User) request.getSession().getAttribute("username");
            return checkReceivedUser(user, request);
        } else {
            String login = request.getParameter("username");
            String pass = request.getParameter("password");

            validateParam(login);
            validateParam(pass);
            User user = new User(ADMIN_LOGIN, ADMIN_PASSWORD);
            Cart cart = new Cart();
            request.getSession().setAttribute("cart", cart);
            request.getSession().setAttribute("username", user);
            return checkReceivedUser(user, request);
        }
    }

    private PagesPath checkReceivedUser(User user, HttpServletRequest request) {
        if (isUserLogIn(user)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            return HOME_PAGE;
        } else {
            return SIGN_IN_PAGE;
        }
    }
}
