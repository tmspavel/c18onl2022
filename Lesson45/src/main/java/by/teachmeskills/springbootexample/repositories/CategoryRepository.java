package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Category;

import java.util.List;

public interface CategoryRepository {
    Category findById(int id);
    List<Category> findAll();
}
