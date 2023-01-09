package com.home.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private int id;
    private String name;
    private int price;
    private Type type;

    @Override
    public String toString() {
        return "Товар: ID: " + id +
                "; Наименование: '" + name +
                "'; Цена: " + price + " руб.";
    }

}
