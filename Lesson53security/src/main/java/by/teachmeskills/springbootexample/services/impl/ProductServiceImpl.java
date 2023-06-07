package by.teachmeskills.springbootexample.services.impl;

import by.teachmeskills.springbootexample.dto.ProductDto;
import by.teachmeskills.springbootexample.dto.SearchParamsDto;
import by.teachmeskills.springbootexample.dto.converters.ProductConverter;
import by.teachmeskills.springbootexample.entities.Product;
import by.teachmeskills.springbootexample.repositories.CategoryRepository;
import by.teachmeskills.springbootexample.repositories.ProductRepository;
import by.teachmeskills.springbootexample.repositories.ProductSearchSpecification;
import by.teachmeskills.springbootexample.services.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static by.teachmeskills.springbootexample.PagesPathEnum.PRODUCT_PAGE;
import static by.teachmeskills.springbootexample.RequestParamsEnum.PRODUCT;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    private final ProductConverter productConverter;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository, ProductConverter productConverter) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.productConverter = productConverter;
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
    public List<Product> getAllForCategoryPaged(int categoryId, int pageNumber, int pageSize) {
//        Pageable paging = PageRequest.of(pageNumber, pageSize);
        Pageable paging = PageRequest.of(pageNumber, pageSize, Sort.by("name").ascending());
        Page<Product> products = productRepository.findAllByCategoryId(categoryId, paging);
        return products.getContent();
    }

    @Override
    public List<Product> getAllByCategoryAndNamePaged(int categoryId, String name, int pageNumber, int pageSize) {
        Pageable paging = PageRequest.of(pageNumber, pageSize);
        Page<Product> products = productRepository.findAllByCategoryIdAndNameContaining(categoryId, name, paging);
        return products.getContent();
    }

    @Override
    public List<Product> searchProducts(String key, String value) {
        Map<String, String> searchParams = new HashMap<>();
        searchParams.put(key, value);
        return productRepository.findProductsListByParams(searchParams);
    }

    @Override
    public ModelAndView getProductData(int id) {
        ModelMap model = new ModelMap();
        productRepository.findById(id).ifPresent(p -> {
            model.addAttribute(PRODUCT.getValue(), p);
        });
        return new ModelAndView(PRODUCT_PAGE.getPath(), model);
    }

    @Override
    public List<ProductDto> searchProducts(SearchParamsDto searchParamsDto) {
        ProductSearchSpecification productSearchSpecification = new ProductSearchSpecification(searchParamsDto);
        return productRepository.findAll(productSearchSpecification).stream().map(productConverter::toDto).toList();
    }
}
