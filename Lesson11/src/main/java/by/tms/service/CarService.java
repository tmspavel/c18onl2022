package by.tms.service;

import by.tms.model.Car;
import by.tms.model.Engine;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CarService implements CarAware {

    private final Car car;

    @Override
    public void stop() {
        Engine engine = car.getEngine();
        if (engine.isStarted()) {
            System.out.println("стоп");
        }
    }

    @Override
    public void start() {
        Engine engine = car.getEngine();
        if (!engine.isStarted()) {
            System.out.println("start");
        }
    }
}
