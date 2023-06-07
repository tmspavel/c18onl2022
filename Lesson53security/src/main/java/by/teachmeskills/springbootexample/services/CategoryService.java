package by.teachmeskills.springbootexample.services;

import by.teachmeskills.springbootexample.dto.CategoryDto;
import by.teachmeskills.springbootexample.entities.Category;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface CategoryService extends BaseService<Category>{
    ModelAndView getCategoryData(int id, int pageNumber, int pageSize);

    ModelAndView getCategoryDataWithCertainProducts(int id, String productName, int pageNumber, int pageSize);

    List<CategoryDto> getAllCategories();

    CategoryDto getCertainCategory(int id);

    CategoryDto createCategory(CategoryDto categoryDto);

    List<CategoryDto> saveCategoriesFromFile(MultipartFile file) throws Exception;
}
