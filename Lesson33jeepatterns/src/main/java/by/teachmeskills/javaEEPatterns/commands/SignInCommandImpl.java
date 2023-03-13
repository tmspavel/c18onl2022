package by.teachmeskills.javaEEPatterns.commands;

import static by.teachmeskills.javaEEPatterns.utils.HttpRequestParamValidator.validateParamNotNull;

import by.teachmeskills.javaEEPatterns.domain.Category;
import by.teachmeskills.javaEEPatterns.domain.User;
import by.teachmeskills.javaEEPatterns.exceptions.CommandException;
import by.teachmeskills.javaEEPatterns.model.PagesPath;
import by.teachmeskills.javaEEPatterns.model.RequestParams;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class SignInCommandImpl implements BaseCommand {

    private static final String ADMIN_LOGIN = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String login = request.getParameter(RequestParams.LOGIN.getValue());
        String pass = request.getParameter(RequestParams.PASSWORD.getValue());

        validateParamNotNull(login);
        validateParamNotNull(pass);

        User user = getUser();
        return checkReceivedUser(user, request);
    }

    private String checkReceivedUser(User user, HttpServletRequest request) {
        if (user != null
                && request.getParameter(RequestParams.LOGIN.getValue()).equals(ADMIN_LOGIN)
                && request.getParameter(RequestParams.PASSWORD.getValue()).equals(ADMIN_PASSWORD)) {

            request.getSession().setAttribute(RequestParams.LOGIN.getValue(), user);
            List<Category> categories = new ArrayList<>();

            Category mobilePhones = new Category("Mobile phones", "mobile.jpg");

            Category laptops = new Category("Laptops", "laptop.jpg");
            Category jpsNavigators = new Category("GPS Navigators", "jps_nav.jpg");
            Category fridges = new Category("Fridges", "fridge.jpg");
            Category car = new Category("Cars", "car.jpg");
            Category camera = new Category("Cars", "camera.jpg");

            categories.add(mobilePhones);
            categories.add(laptops);
            categories.add(jpsNavigators);
            categories.add(fridges);
            categories.add(car);
            categories.add(camera);

            request.setAttribute("categories", categories);

            return PagesPath.HOME_PAGE.getPath();
        } else {
            return PagesPath.SIGN_IN_PAGE.getPath();
        }
    }

    private User getUser() {
        return new User(ADMIN_LOGIN, ADMIN_PASSWORD);
    }

}
