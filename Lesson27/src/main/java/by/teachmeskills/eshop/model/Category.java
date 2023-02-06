package by.teachmeskills.eshop.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {

    private String id;
    private String name;
    private String imageName;
    private List<Product> productList;

    public Category(String id, String imageName) {
        this.id = id;
        this.imageName = imageName;
    }
}
