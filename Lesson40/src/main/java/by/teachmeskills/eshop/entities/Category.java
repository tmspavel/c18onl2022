package by.teachmeskills.eshop.entities;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class Category extends BaseEntity {

    private String name;
    private String imagePath;
    private int rating;

    private List<Product> productList;

    @Builder
    public Category(int id, String name, String imagePath, int rating) {
        super(id);
        this.name = name;
        this.imagePath = imagePath;
        this.rating = rating;
    }
}
