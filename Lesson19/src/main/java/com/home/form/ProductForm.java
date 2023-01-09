package com.home.form;

import com.home.model.Product;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductForm {
    private int id;
    private String name;
    private int price;

    public static Product toGood(ProductForm form) {
        return Product.builder()
                .id(form.getId())
                .name(form.getName())
                .price(form.getPrice())
                .build();
    }

    public static ProductForm fromGood(Product product) {
        return ProductForm.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }

}
