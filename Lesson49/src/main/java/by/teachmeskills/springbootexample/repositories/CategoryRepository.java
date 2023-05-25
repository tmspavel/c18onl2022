package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.dto.CategoryDto;
import by.teachmeskills.springbootexample.entities.Category;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository {
    Category findById(int id);
    List<Category> findAll();
    Category createCategory(Category category);

}
