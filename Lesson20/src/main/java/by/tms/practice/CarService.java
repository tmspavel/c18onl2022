package by.tms.practice;

import lombok.AllArgsConstructor;

import java.util.function.Function;

@AllArgsConstructor
public class CarService implements Function<Car, Boolean> {
    private boolean flag;

    @Override
    public Boolean apply(Car car) {
        if (flag) {
            return car.getPrice() == 10000;
        }
        return car.getPrice() > 15000;
    }
}
