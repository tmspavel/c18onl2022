package by.teachmeskills.springbootexample.dto.converters;

import by.teachmeskills.springbootexample.dto.ProductDto;
import by.teachmeskills.springbootexample.entities.Product;
import by.teachmeskills.springbootexample.repositories.CategoryRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    private final CategoryRepository categoryRepository;

    public ProductConverter(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public ProductDto toDto(Product product){
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .categoryId(product.getCategory().getId())
                .build();
    }

    public Product fromDto(ProductDto productDto){
        return Product.builder()
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice()).imagePath("/images/new.jpg")
                .category(categoryRepository.findById(productDto.getCategoryId()).orElse(null))
                .build();
    }
}
