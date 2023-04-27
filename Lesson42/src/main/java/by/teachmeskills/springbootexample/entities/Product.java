package by.teachmeskills.springbootexample.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class Product extends BaseEntity {

    private String name;
    private String description;
    private int price;
    private int categoryId;
    private String imagePath;
}
