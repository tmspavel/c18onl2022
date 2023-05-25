package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Product;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository {
    Product findById(int id);

    @Query("select p from Product p where p.category.id = :categoryId")
    List<Product> findAllByCategoryId(int categoryId);
}
