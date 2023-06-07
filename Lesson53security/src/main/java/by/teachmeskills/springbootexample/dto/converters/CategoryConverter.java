package by.teachmeskills.springbootexample.dto.converters;

import by.teachmeskills.springbootexample.dto.CategoryDto;
import by.teachmeskills.springbootexample.entities.Category;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryConverter {
    private final ProductConverter productConverter;

    public CategoryConverter(ProductConverter productConverter) {
        this.productConverter = productConverter;
    }

    public CategoryDto toDto(Category category) {


        return Optional.ofNullable(category).map(c -> CategoryDto.builder()
                        .id(c.getId())
                        .name(c.getName())
                        .rating(c.getRating())
                        .products(Optional.ofNullable(c.getProductList()).map(products -> products.stream().map(productConverter::toDto).toList()).orElse(List.of()))
                        .build())
                .orElse(null);
    }

    public Category fromDto(CategoryDto categoryDto) {
        return Optional.ofNullable(categoryDto).map(cd -> Category.builder()
                        .name(categoryDto.getName())
                        .rating(5)
                        .imagePath("/image/new.jpg")
                        .build())
                .orElse(null);
    }
}
