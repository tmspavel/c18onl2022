package by.teachmeskills.eshop.repository;

import by.teachmeskills.eshop.model.Category;
import java.util.List;

public interface CategoryRepository extends Repository {

    List<Category> getCategories();

    Category getCategory(int id);
}
