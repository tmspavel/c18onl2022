package by.teachmeskills.springbootexample.services;

import by.teachmeskills.springbootexample.entities.User;
import by.teachmeskills.springbootexample.exceptions.AuthorizationException;
import org.springframework.web.servlet.ModelAndView;

public interface UserService extends BaseService<User> {

    ModelAndView authenticate(User user) throws AuthorizationException;

}
