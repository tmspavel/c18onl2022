package by.teachmeskills.springbootexample.entities;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@SuperBuilder
public class Category extends BaseEntity {
    private String name;
    private String imagePath;
    private int rating;

    private List<Product> productList;
}
