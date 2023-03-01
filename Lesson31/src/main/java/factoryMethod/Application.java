package factoryMethod;

import singleton.otherExamples.enumSingleton.EnumSingleton;

public class Application {


    public static void main(String[] args) {
        CarFactory comfortCarFactory = new ComfortCarFactory();
        CarFactory premiumCarFactory = new PremiumCarFactory();

        Car comfortEquipmentCar = comfortCarFactory.createCar();
        System.out.println(comfortEquipmentCar.toString());
        System.out.println();

        Car premiumEquipmentCar = premiumCarFactory.createCar();
        System.out.println(premiumEquipmentCar.toString());
        EnumSingleton.INSTANCE.test();
    }
}
