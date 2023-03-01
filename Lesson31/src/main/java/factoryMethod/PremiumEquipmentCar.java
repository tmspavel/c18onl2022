package factoryMethod;

import singleton.otherExamples.enumSingleton.EnumSingleton;

public class PremiumEquipmentCar extends Car {

    public PremiumEquipmentCar() {
        name = "Premium equipment car";
        accessories.add("Leather saloon");
        accessories.add("Air condition");
        accessories.add("GPS");
        accessories.add("Heated steering wheel");
        EnumSingleton.INSTANCE.test();
    }

}
