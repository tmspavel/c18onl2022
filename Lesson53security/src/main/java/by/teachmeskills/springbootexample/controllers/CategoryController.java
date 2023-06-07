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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

import static by.teachmeskills.springbootexample.PagesPathEnum.UPLOAD_PAGE;

@Validated
@Tag(name = "category", description = "The Category API")
@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{id}")
    public ModelAndView openCategoryPage(
            @PathVariable int id,
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize) {
        return categoryService.getCategoryData(id, pageNumber, pageSize);
    }

    @GetMapping("/{id}/{productName}")
    public ModelAndView openCategoryPageWithCertainProducts(
            @PathVariable int id,
            @PathVariable String productName,
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize) {
        return categoryService.getCategoryDataWithCertainProducts(id, productName, pageNumber, pageSize);
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
//    @Parameter(name = "name", description = "Name of category")
    @GetMapping("/all/{id}")
    public ResponseEntity<List<CategoryDto>> getAllCategories(@Min(value = 5, message = "Min value for Id is 5") @PathVariable String id) {
        System.out.println(id);
        return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
    }

    @GetMapping("/single/{id}")
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable int id) {
        CategoryDto categoryDto = categoryService.getCertainCategory(id);
        if (Optional.ofNullable(categoryDto).isPresent()) {
            return new ResponseEntity<>(categoryDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Operation(
            summary = "Create category",
            description = "Create new category",
            tags = {"category"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Category was successfully created",
                    content = @Content(schema = @Schema(implementation = CategoryDto.class))
            ),
            @ApiResponse(
                    responseCode = "403",
                    description = "Category not created - forbidden operation"
            )
    })
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            required = true,
            description = "Create category body",
            content = @Content(schema = @Schema(implementation = CategoryDto.class))
    )
    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED) //Or we can use @ResponseStatus(HttpStatus.CREATED) annotation with appropriate status code to show the result
//    public void createCategory(@RequestBody CategoryDto categoryDto) {
    public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {
        CategoryDto created = categoryService.createCategory(categoryDto);
        if (Optional.ofNullable(created).isPresent()) {
            return new ResponseEntity<>(created, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/upload")
    public ResponseEntity<List<CategoryDto>> createCategory(@RequestParam("file") MultipartFile file) throws Exception {
        return new ResponseEntity<>(categoryService.saveCategoriesFromFile(file), HttpStatus.CREATED);
    }
}
