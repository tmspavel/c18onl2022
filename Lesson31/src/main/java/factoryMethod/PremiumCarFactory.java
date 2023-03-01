package factoryMethod;

public class PremiumCarFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new PremiumEquipmentCar();
    }
}
