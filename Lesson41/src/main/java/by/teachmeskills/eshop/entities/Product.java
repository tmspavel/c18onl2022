package by.teachmeskills.eshop.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product extends BaseEntity {

    private String name;
    private String description;
    private int price;
    private int categoryId;
    private String imagePath;

    @Builder
    public Product(int id, String name, String description, int price, int categoryId, String imagePath) {
        super(id);
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.imagePath = imagePath;
    }
}
