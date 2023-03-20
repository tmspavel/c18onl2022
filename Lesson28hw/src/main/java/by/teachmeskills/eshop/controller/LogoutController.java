package by.teachmeskills.eshop.controller;

import static by.teachmeskills.eshop.model.PagesPath.SIGN_IN_PAGE;

import by.teachmeskills.eshop.model.PagesPath;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession(false);
        session.invalidate();
        return SIGN_IN_PAGE;
    }
}
