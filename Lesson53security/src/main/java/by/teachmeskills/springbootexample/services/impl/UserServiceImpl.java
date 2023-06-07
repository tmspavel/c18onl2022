package by.teachmeskills.springbootexample.services.impl;

import by.teachmeskills.springbootexample.entities.Category;
import by.teachmeskills.springbootexample.entities.User;
import by.teachmeskills.springbootexample.exceptions.AuthorizationException;
import by.teachmeskills.springbootexample.repositories.UserRepository;
import by.teachmeskills.springbootexample.services.CategoryService;
import by.teachmeskills.springbootexample.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import static by.teachmeskills.springbootexample.PagesPathEnum.START_PAGE;
import static by.teachmeskills.springbootexample.RequestParamsEnum.POPULAR_CATEGORIES_LIST_REQ_PARAM;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final CategoryService categoryService;

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, CategoryService categoryService, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.categoryService = categoryService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User create(User entity) {
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        return userRepository.save(entity);
    }

    @Override
    public List<User> read() {
        return userRepository.findAll();
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
        log.info("Authentication method call");
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
                throw new AuthorizationException("User is not authorized! Please, try again.");
            }
        }
        return modelAndView;
    }
}
