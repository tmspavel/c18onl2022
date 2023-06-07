package by.teachmeskills.springbootexample.services;

import by.teachmeskills.springbootexample.dto.ProductDto;
import by.teachmeskills.springbootexample.dto.SearchParamsDto;
import by.teachmeskills.springbootexample.entities.Product;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface ProductService extends BaseService<Product>{
    List<Product> getAllForCategory(int categoryId);
    List<Product> getAllForCategoryPaged(int categoryId, int pageNumber, int pageSize);
    List<Product> getAllByCategoryAndNamePaged(int categoryId, String title, int pageNumber, int pageSize);
    List<Product> searchProducts(String key, String value);
    ModelAndView getProductData(int id);
    List<ProductDto> searchProducts(SearchParamsDto searchParamsDto);
}
