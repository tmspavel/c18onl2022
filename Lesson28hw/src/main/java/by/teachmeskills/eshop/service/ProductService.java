package by.teachmeskills.eshop.service;

import by.teachmeskills.eshop.model.Product;
import by.teachmeskills.eshop.repository.ProductRepository;
import by.teachmeskills.eshop.repository.impl.ProductRepositoryImpl;
import java.util.List;

public class ProductService {

    private final ProductRepository productRepository = new ProductRepositoryImpl();

    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    public List<Product> getProductsByCategoryId(int categoryId) {
        return productRepository.getProductsByCategoryId(categoryId);
    }
}
