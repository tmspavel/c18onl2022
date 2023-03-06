package by.home.structural.adapter3;

public class Main {

    public static void main(String[] args) {
        Car car = new by.home.structural.adapter3.AdapterTruckToCar(new by.home.structural.adapter3.MyTrack());
        car.washCar();
    }
}
