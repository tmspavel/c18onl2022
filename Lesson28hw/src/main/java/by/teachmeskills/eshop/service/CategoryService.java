package by.teachmeskills.eshop.service;

import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.repository.CategoryRepository;
import by.teachmeskills.eshop.repository.impl.JdbcCategoryRepositoryImpl;
import java.util.List;

public class CategoryService implements CategoryServiceAware {

    private final CategoryRepository categoryRepository = new JdbcCategoryRepositoryImpl();

    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }

    public Category getCategoryById(int id) {
        return categoryRepository.getCategory(id);
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }
}
