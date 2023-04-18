package by.teachmeskills.eshop.services;

import by.teachmeskills.eshop.entities.User;
import org.springframework.web.servlet.ModelAndView;

public interface UserService extends BaseService<User> {

    ModelAndView authenticate(User user);

}
