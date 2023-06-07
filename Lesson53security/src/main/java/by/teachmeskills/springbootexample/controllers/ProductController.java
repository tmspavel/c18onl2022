package by.teachmeskills.springbootexample.controllers;

import by.teachmeskills.springbootexample.dto.ProductDto;
import by.teachmeskills.springbootexample.dto.SearchParamsDto;
import by.teachmeskills.springbootexample.entities.Product;
import by.teachmeskills.springbootexample.services.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/product")
@Tag(name = "product", description = "The Product API")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ModelAndView openProductPage(@PathVariable int id) {
        return productService.getProductData(id);
    }

    @GetMapping
    public List<Product> search(@RequestParam String key, @RequestParam String value) {
        return productService.searchProducts(key, value);
    }

    @Operation(
            summary = "Search product",
            description = "Advanced search by category name, price and search key")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Products found",
                    content = @Content(schema = @Schema(implementation = ProductDto.class))
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Products not found"
            )
    })
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            required = true,
            description = "Search product",
            content = @Content(schema = @Schema(implementation = SearchParamsDto.class))
    )
    @PostMapping("/search")
    public List<ProductDto> advancedSearch(@RequestBody SearchParamsDto searchParamsDto) {
        return productService.searchProducts(searchParamsDto);
    }
}
