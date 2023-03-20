package by.teachmeskills.eshop.service;

import by.teachmeskills.eshop.model.Inject;
import by.teachmeskills.eshop.model.Product;
import by.teachmeskills.eshop.repository.ProductRepository;
import java.util.List;
import lombok.Setter;

@Setter
public class ProductService {

    @Inject
    private ProductRepository productRepository;

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
