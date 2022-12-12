package com.tms.fruits;

public class FruitFactory {

    public Fruit createFruit(TypeFruit type, double weight, double pricePerKilogram) {
        return switch (type) {
            case APPLE -> Apple.builder().weight(weight).pricePerKilogram(pricePerKilogram).build();
            case APRICOT -> Apricot.builder().weight(weight).pricePerKilogram(pricePerKilogram).build();
            case PEAR -> Pear.builder().weight(weight).pricePerKilogram(pricePerKilogram).build();
            case BANANA -> Banana.builder().pricePerKilogram(pricePerKilogram).build();
        };
    }
}
