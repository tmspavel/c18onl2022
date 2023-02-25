package by.teachmeskills.eshop.repository;

import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.utils.CategoryHelper;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {

    @Override
    public List<Category> getCategories() {
        return CategoryHelper.categories;
    }
}
