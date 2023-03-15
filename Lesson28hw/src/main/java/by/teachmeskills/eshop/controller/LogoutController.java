package by.teachmeskills.eshop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutController implements BaseController {

    @Override
    public String execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession(false);
        session.invalidate();
        return "signin.jsp";
    }
}
