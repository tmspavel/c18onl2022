package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Category;

public interface CategoryRepository extends BaseRepository<Category> {

    Category findById(int id);
}
