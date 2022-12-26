package homework.result4;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Car implements Serializable {

    private String brand;
    private int maxSpeed;
    private int price;

    public Car(String brand, int maxSpeed, int price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Это автомобиль " +
                "марки " + brand + ". " +
                "Максимальная скорость составляет " + maxSpeed + " км/ч. " +
                "Цена " + price + " $.";
    }
}

