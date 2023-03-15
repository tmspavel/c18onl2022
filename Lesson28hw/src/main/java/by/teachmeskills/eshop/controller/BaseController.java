package by.teachmeskills.eshop.controller;

import javax.servlet.http.HttpServletRequest;

public interface BaseController {

    String execute(HttpServletRequest request) throws Exception;
}


