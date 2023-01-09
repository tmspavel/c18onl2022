package by.tms.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        car -> car.getPrice() > 15000;
        CarService carService = new CarService(true);
        Boolean apply = carService.apply(new Car(20000));
        System.out.println(apply);
//        System.out.println(getCountCarsByPredicate(cars, carService));
//        System.out.println(getCountCarsByPredicate(cars, new CarService(false)));
        Predicate<Car> carPredicate = car -> car.getPrice() > 15000;
        Predicate<Car[]> tPublisher = arrCars -> {
            for (Car arrCar : arrCars) {
                //логика
            }
            return false;
        };

        Car[] cars = {
                new Car(34000),
                new Car(44000),
                new Car(14000),
                new Car(10000),
        };
//        try (FileInputStream sdf = new FileInputStream("c:\\temp")) {
//            System.out.println();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        List<Box> boxList = Arrays.stream(cars)
                .filter(car -> car.getPrice() > 15000)
                .sorted(Comparator.comparing(Car::getPrice))
                .peek(car -> {
//                    car.setPrice(0);
                    System.out.println(car);
                })
//                .map(car -> new Box(car))
                .map(Box::new)
                .toList();

        List<String> stringList = boxList.stream()
                .flatMap(box -> box.getNames().stream())
                .map(String::toUpperCase)
                .toList();


        boxList.add(new Box(new Car(22)));
        System.out.println(boxList);

        System.out.println(Arrays.toString(cars));

        boolean test = tPublisher.test(cars);

        Boolean aBoolean = carPredicate.test(new Car(20000));
        System.out.println(aBoolean);


        System.out.println(getCountCarsByPredicate(cars, carPredicate));
        System.out.println(getCountCarsByPredicate(cars, car -> car.getPrice() == 10000));
    }

    private static int getCountCarsByPredicate(Car[] cars, Predicate<Car> function) {
        int result = 0;
        for (Car car : cars) {
            if (function.test(car)) {
                result++;
            }
        }
        return result;
    }

}
