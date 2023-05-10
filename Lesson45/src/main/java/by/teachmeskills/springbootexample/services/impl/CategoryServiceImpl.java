package by.teachmeskills.springbootexample.services.impl;

import by.teachmeskills.springbootexample.entities.Category;
import by.teachmeskills.springbootexample.entities.Product;
import by.teachmeskills.springbootexample.repositories.CategoryRepository;
import by.teachmeskills.springbootexample.services.CategoryService;
import by.teachmeskills.springbootexample.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import static by.teachmeskills.springbootexample.PagesPathEnum.CATEGORY_PAGE;
import static by.teachmeskills.springbootexample.RequestParamsEnum.CATEGORY_PARAM;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ProductService productService;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ProductService productService) {
        this.categoryRepository = categoryRepository;
        this.productService = productService;
    }

    @Override
    public Category create(Category entity) {
        return null;
    }

    @Override
    public List<Category> read() {
        return categoryRepository.findAll();
    }

    @Override
    public Category update(Category entity) {
        return null;
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public ModelAndView getCategoryData(int id) {
        ModelMap model = new ModelMap();

        Category category = categoryRepository.findById(id);
        if(Optional.ofNullable(category).isPresent()){
            List<Product> products = productService.getAllForCategory(category.getId());
            category.setProductList(products);
            model.addAttribute(CATEGORY_PARAM.getValue(), category);
        }

        return new ModelAndView(CATEGORY_PAGE.getPath(), model);
    }
}
