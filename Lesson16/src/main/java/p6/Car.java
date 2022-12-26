package p6;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
//@EqualsAndHashCode(of = "id")
public class Car {
    private Long id;
    private String name;
    private String color;
    private int price;
    private Engine engine;

    public Car(Long id, String name, String color, int price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    //    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(id, car.id) && Objects.equals(name, car.name) && Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, price, engine);
    }

    @AllArgsConstructor
    @EqualsAndHashCode
    class Engine {
        private String name;
    }
}
