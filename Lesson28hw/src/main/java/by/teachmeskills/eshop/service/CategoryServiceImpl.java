package by.teachmeskills.eshop.service;

import by.teachmeskills.eshop.model.Category;
import by.teachmeskills.eshop.model.Inject;
import by.teachmeskills.eshop.repository.CategoryRepository;
import java.util.List;
import lombok.Setter;

@Setter
public class CategoryServiceImpl implements CategoryService {

    @Inject
    private CategoryRepository categoryRepository;

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
