package by.teachmeskills.eshop.model;

import java.math.BigDecimal;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

@Setter
@Getter
@EqualsAndHashCode(of = "id")
@ToString
@Value(staticConstructor = "of")
public class MyProduct {

    private int id;
    private String imageName;
    private String name;
    private String description;
    private BigDecimal price;
    private int categoryId;
}
