package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Category;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    Category findById(int id);
    @Query("from Category")
    List<Category> findAllCategories();
//    List<Category> findAllByRating(int rating, Pageable pageable);

    //    List<Category> findAll(Pageable pageable);
//    @Query("SELECT t FROM Category t")
//    List<Category> findMyAll();

}
