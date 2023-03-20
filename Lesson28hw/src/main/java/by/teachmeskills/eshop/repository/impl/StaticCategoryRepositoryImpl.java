package by.teachmeskills.eshop.repository.impl;

import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.repository.CategoryRepository;
import by.teachmeskills.eshop.utils.CategoryHelper;
import java.util.List;

public class StaticCategoryRepositoryImpl implements CategoryRepository {

    @Override
    public List<Category> getCategories() {
        return CategoryHelper.categories;
    }

    @Override
    public Category getCategory(int id) {
        List<Category> categories = getCategories();
        return categories.stream()
                         .filter(category -> category.getId() == id)
                         .findFirst()
                         .orElse(null);
    }
}
//page -> servlet -> service -> repository
