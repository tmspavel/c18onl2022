package by.teachmeskills.springbootexample.entities;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder
public class Category extends BaseEntity {

    private String name;
    private String imagePath;
    private int rating;

    private List<Product> productList;

}
