package by.teachmeskills.springbootexample.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import static by.teachmeskills.springbootexample.PagesPathEnum.ERROR_PAGE;
import static by.teachmeskills.springbootexample.RequestParamsEnum.ERROR_PARAM;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    //Put exact ResponseStatus together with Exception
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(AuthorizationException.class)
    public ModelAndView handleAuthException(Exception ex) {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute(ERROR_PARAM.getValue(), ex.getMessage());
        ModelAndView model = new ModelAndView();
        model.setViewName(ERROR_PAGE.getPath());
        model.addAllObjects(modelMap);
        return model;
    }
}
