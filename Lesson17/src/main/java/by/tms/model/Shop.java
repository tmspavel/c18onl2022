package by.tms.model;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
public class Shop {
    private List<Product> products;

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<>();
        }
        return products;
    }
}
