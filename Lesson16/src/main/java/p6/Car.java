package p6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    private String name;
    private String color;
    private int price;


//    @Override
//    public int hashCode() {
//        return 12;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name) && Objects.equals(color, car.color);
    }
}
