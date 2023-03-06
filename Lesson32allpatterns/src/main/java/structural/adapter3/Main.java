package structural.adapter3;

public class Main {

    public static void main(String[] args) {
        Car car = new structural.adapter3.AdapterTruckToCar(new structural.adapter3.MyTrack());
        car.washCar();
    }
}
