package by.teachmeskills.eshop.controller;

import by.teachmeskills.eshop.model.PagesPath;
import javax.servlet.http.HttpServletRequest;

public interface BaseCommandController {

    PagesPath execute(HttpServletRequest request) throws Exception;
}


