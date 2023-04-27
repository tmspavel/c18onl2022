package by.teachmeskills.springbootexample.services.impl;

import static by.teachmeskills.springbootexample.model.PagesPathEnum.PRODUCT_PAGE;
import static by.teachmeskills.springbootexample.model.RequestParamsEnum.PRODUCT;

import by.teachmeskills.springbootexample.entities.Product;
import by.teachmeskills.springbootexample.repositories.ProductRepository;
import by.teachmeskills.springbootexample.services.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product entity) {
        return null;
    }

    @Override
    public List<Product> read() {
        return null;
    }

    @Override
    public Product update(Product entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Product> getAllForCategory(int categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }

    @Override
    public ModelAndView getProductData(int id) {
        ModelMap model = new ModelMap();
        Product product = productRepository.findById(id);
        if (Optional.ofNullable(product).isPresent()) {
            model.addAttribute(PRODUCT.getValue(), product);
        }
        return new ModelAndView(PRODUCT_PAGE.getPath(), model);
    }
}
