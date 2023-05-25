package by.teachmeskills.springbootexample.controllers;

import by.teachmeskills.springbootexample.dto.CategoryDto;
import by.teachmeskills.springbootexample.services.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.time.LocalDate;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import static by.teachmeskills.springbootexample.PagesPathEnum.UPLOAD_PAGE;
import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

@Tag(name = "category", description = "The Category API")
@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public ModelAndView openCategoryPage(@PathVariable int id) {
        return categoryService.getCategoryData(id);
    }

    @GetMapping("/upload")
    public ModelAndView openUploadCategoriesPage() {
        return new ModelAndView(UPLOAD_PAGE.getPath());
    }

    @Operation(
            summary = "Find all categories",
            description = "Find all existed categories in Eshop",
            tags = {"category"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "All categories were found",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = CategoryDto.class)))
            ),
            @ApiResponse(
                    responseCode = "403",
                    description = "Categories not fount - forbidden operation"
            )
    })
    @GetMapping("/all")
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public CategoryDto getCategoryById(@PathVariable int id) {
        CategoryDto categoryDto = categoryService.getCertainCategory(id);
        categoryDto.setLocalDate(LocalDate.now());
//        if (Optional.ofNullable(categoryDto).isPresent()) {
//        if (categoryDto != null) {
            return categoryDto;
//            return new ResponseEntity<>(categoryDto, HttpStatus.OK);
//        } else {
//            return null;
////            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
    }

    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED) //Or we can use @ResponseStatus(HttpStatus.CREATED) annotation with appropriate status code to show the result
//    public void createCategory(@RequestBody CategoryDto categoryDto) {
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {
        CategoryDto created = categoryService.createCategory(categoryDto);
        if (Optional.ofNullable(created).isPresent()) {
            return new ResponseEntity<>(categoryDto, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/upload")
    public ResponseEntity<List<CategoryDto>> createCategory(@RequestParam("file") MultipartFile file) throws Exception {
        return new ResponseEntity<>(categoryService.saveCategoriesFromFile(file), HttpStatus.CREATED);
    }
}
