package by.teachmeskills.springbootexample.repositories;

import by.teachmeskills.springbootexample.entities.Product;

import java.util.List;
import java.util.Map;

public interface SearchProductsRepository {
    List<Product> findProductsListByParams(Map<String, String> searchParams);
}
