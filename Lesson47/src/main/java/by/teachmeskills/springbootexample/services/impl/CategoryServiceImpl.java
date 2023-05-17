package by.teachmeskills.springbootexample.services.impl;

import by.teachmeskills.springbootexample.dto.CategoryDto;
import by.teachmeskills.springbootexample.dto.converters.CategoryConverter;
import by.teachmeskills.springbootexample.entities.Category;
import by.teachmeskills.springbootexample.entities.Product;
import by.teachmeskills.springbootexample.repositories.CategoryRepository;
import by.teachmeskills.springbootexample.services.CategoryService;
import by.teachmeskills.springbootexample.services.ProductService;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static by.teachmeskills.springbootexample.PagesPathEnum.CATEGORY_PAGE;
import static by.teachmeskills.springbootexample.RequestParamsEnum.CATEGORY_PARAM;

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ProductService productService;
    private final CategoryConverter categoryConverter;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ProductService productService, CategoryConverter categoryConverter) {
        this.categoryRepository = categoryRepository;
        this.productService = productService;
        this.categoryConverter = categoryConverter;
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
    public ModelAndView getCategoryData(int id, int pageNumber, int pageSize) {
        ModelMap model = new ModelMap();

        Optional<Category> category = categoryRepository.findById(id);

        category.ifPresent(c -> {
            List<Product> products = productService.getAllForCategoryPaged(c.getId(), pageNumber, pageSize);
            c.setProductList(products);
            model.addAttribute(CATEGORY_PARAM.getValue(), c);
        });

        return new ModelAndView(CATEGORY_PAGE.getPath(), model);
    }

    @Override
    public ModelAndView getCategoryDataWithCertainProducts(int id, String productName, int pageNumber, int pageSize) {
        ModelMap model = new ModelMap();

        Optional<Category> category = categoryRepository.findById(id);

        category.ifPresent(c -> {
            List<Product> products = productService.getAllByCategoryAndNamePaged(c.getId(), productName, pageNumber, pageSize);
            c.setProductList(products);
            model.addAttribute(CATEGORY_PARAM.getValue(), c);
        });

        return new ModelAndView(CATEGORY_PAGE.getPath(), model);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream().map(categoryConverter::toDto).toList();
    }

    @Override
    public CategoryDto getCertainCategory(int id) {
        return categoryRepository.findById(id)
                                 .map(categoryConverter::toDto)
                                 .orElse(new CategoryDto());
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        try {
            Category category = categoryConverter.fromDto(categoryDto);
            category = categoryRepository.save(category);
            return categoryConverter.toDto(category);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<CategoryDto> saveCategoriesFromFile(MultipartFile file) {
        List<CategoryDto> csvCategories = parseCsv(file);
        List<Category> categories = Optional.ofNullable(csvCategories)
                .map(list -> list.stream()
                        .map(categoryConverter::fromDto)
                        .toList())
                .orElse(null);
        if (Optional.ofNullable(categories).isPresent()) {
            categoryRepository.saveAll(categories);
            return csvCategories;
        }
        return Collections.emptyList();
    }

    private List<CategoryDto> parseCsv(MultipartFile file) {
        if (Optional.ofNullable(file).isPresent()) {
            try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
                CsvToBean<CategoryDto> csvToBean = new CsvToBeanBuilder(reader)
                        .withType(CategoryDto.class)
                        .withIgnoreLeadingWhiteSpace(true)
                        .withSeparator(',')
                        .build();

                return csvToBean.parse();
            } catch (Exception ex) {
                log.error("Exception occurred during CSV parsing: {}", ex.getMessage());
            }
        } else {
            log.error("Empty CSV file is uploaded.");
        }
        return Collections.emptyList();
    }
}
