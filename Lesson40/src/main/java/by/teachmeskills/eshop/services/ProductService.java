package by.teachmeskills.eshop.services;

import by.teachmeskills.eshop.entities.Product;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;

public interface ProductService extends BaseService<Product> {

    List<Product> getAllForCategory(int categoryId);

    ModelAndView getProductData(int id);
}
