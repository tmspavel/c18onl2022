package by.teachmeskills.springbootexample.services;

import by.teachmeskills.springbootexample.entities.Category;
import org.springframework.web.servlet.ModelAndView;

public interface CategoryService extends BaseService<Category> {

    ModelAndView getCategoryData(int id);
}
