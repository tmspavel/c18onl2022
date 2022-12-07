package by.tms;

import by.tms.model.Car;
import by.tms.model.Engine;
import by.tms.service.CarAware;
import by.tms.service.CarService;

public class Main {
    public static void main(String[] args) {
        CarAware car = new CarService(new Car("тайота", new Engine("дизель")));
        car.start();
        car.stop();
    }
}
