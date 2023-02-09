package by.teachmeskills.eshop.servletexample;

import static by.teachmeskills.eshop.utils.HttpRequestParamValidator.validateParamNotNull;

import by.teachmeskills.eshop.exceptions.RequestParamNullException;
import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class ApplicationServlet extends HttpServlet {

    private static final String ADMIN_LOGIN = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("signin.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("username");
        String pass = req.getParameter("password");
        try {
            validateParamNotNull(login);
            validateParamNotNull(pass);

            User adminUser = new User(ADMIN_LOGIN, ADMIN_PASSWORD);
//1 вариант forward
//            RequestDispatcher rd = req.getRequestDispatcher(checkReceivedUser(adminUser, req));
//            rd.forward(req, resp);
//2 варинант с sendRedirect
            resp.sendRedirect(checkReceivedUser(adminUser, req));
        } catch (RequestParamNullException e) {
            System.out.println(e.getMessage());
        }
    }

    private String checkReceivedUser(User user, HttpServletRequest request) {
        if (ADMIN_LOGIN.equals(request.getParameter("username"))
                && ADMIN_PASSWORD.equals(request.getParameter("password"))) {

            request.getSession().setAttribute("username", user);

            List<Category> categories = getCategories();

            request.getSession().setAttribute("categories", categories);

            return "home.jsp";
        } else {
            return "signin.jsp";
        }
    }

    private List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        Category mobilePhones = new Category("Mobile phones", "mobile.jpg");
        Category laptops = new Category("Laptops", "laptop.jpg");
        Category jpsNavigators = new Category("GPS Navigators", "jps_nav.jpg");
        Category fridges = new Category("Fridges", "fridge.jpg");
        Category car = new Category("Cars", "car.jpg");
        Category camera = new Category("Camera", "camera.jpg");
        categories.add(mobilePhones);
        categories.add(laptops);
        categories.add(jpsNavigators);
        categories.add(fridges);
        categories.add(car);
        categories.add(camera);
        return categories;
    }
}
