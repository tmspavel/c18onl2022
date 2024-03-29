package by.teachmeskills.eshop.model;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart implements Serializable {

    private List<Product> products;

    public void addProduct(Product myProduct) {
        products.add(myProduct);
    }

    public void deleteProduct(Product myProduct) {
        products.remove(myProduct);
    }
}
