package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Order;
import by.teachmeskills.springbootexample.entities.Product;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findById(int id);

    List<Product> findAllByCategoryId(int categoryId);
}
