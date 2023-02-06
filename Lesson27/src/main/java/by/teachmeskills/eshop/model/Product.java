package by.teachmeskills.eshop.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private int id;
    private String name;
    private String description;
    private BigDecimal price;

}
