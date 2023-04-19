package by.teachmeskills.eshop.services.impl;

import static by.teachmeskills.eshop.PagesPathEnum.START_PAGE;
import static by.teachmeskills.eshop.RequestParamsEnum.POPULAR_CATEGORIES_LIST_REQ_PARAM;

import by.teachmeskills.eshop.entities.Category;
import by.teachmeskills.eshop.entities.User;
import by.teachmeskills.eshop.exceptions.AuthorizationException;
import by.teachmeskills.eshop.repositories.UserRepository;
import by.teachmeskills.eshop.services.CategoryService;
import by.teachmeskills.eshop.services.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final CategoryService categoryService;

    public UserServiceImpl(UserRepository userRepository, CategoryService categoryService) {
        this.userRepository = userRepository;
        this.categoryService = categoryService;
    }

    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public List<User> read() {
        return userRepository.read();
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public ModelAndView authenticate(User user) throws AuthorizationException {
        ModelAndView modelAndView = new ModelAndView();
        if (Optional.ofNullable(user).isPresent()
                && Optional.ofNullable(user.getEmail()).isPresent()
                && Optional.ofNullable(user.getPassword()).isPresent()) {
            User loggedUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
            if (Optional.ofNullable(loggedUser).isPresent()) {
                ModelMap modelMap = new ModelMap();
                List<Category> categoriesList = categoryService.read();
                modelMap.addAttribute(POPULAR_CATEGORIES_LIST_REQ_PARAM.getValue(), categoriesList);
                modelAndView.setViewName(START_PAGE.getPath());
                modelAndView.addAllObjects(modelMap);
            } else {
//                modelAndView.setViewName(SIGN_IN_PAGE.getPath());
                throw new AuthorizationException("User is not authorized! Please, try again.");
            }
        }
        return modelAndView;
    }
}
