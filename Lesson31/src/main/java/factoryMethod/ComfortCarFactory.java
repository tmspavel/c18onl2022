package factoryMethod;

public class ComfortCarFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new ComfortEquipmentCar();
    }
}
