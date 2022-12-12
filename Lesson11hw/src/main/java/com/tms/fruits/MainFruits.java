package com.tms.fruits;

import java.util.ArrayList;
import java.util.List;

import static com.tms.fruits.TypeFruit.*;

public class MainFruits {
    public static void main(String[] args) {
        Banana build = Banana.builder().pricePerKilogram(10).build();
        System.out.println(build);
        List<Fruit> fruits = new ArrayList<>();

        FruitFactory fruitFactory = new FruitFactory();
        fruits.add(fruitFactory.createFruit(APPLE, 2.3, 45));
        fruits.add(fruitFactory.createFruit(APPLE, 5.3, 5));
        fruits.add(fruitFactory.createFruit(APPLE, 4.3, 16));
        fruits.add(fruitFactory.createFruit(APRICOT, 2.8, 2.3));
        fruits.add(fruitFactory.createFruit(APRICOT, 3.1, 5.9));
        fruits.add(fruitFactory.createFruit(APRICOT, 6.8, 3.9));
        fruits.add(fruitFactory.createFruit(PEAR, 2.8, 2.3));
        fruits.add(fruitFactory.createFruit(APRICOT, 2.8, 2.3));
        fruits.add(fruitFactory.createFruit(APRICOT, 2.8, 2.3));

        ShopAware fruitShop = new FruitShop(fruits);
        fruitShop.toSell();
    }
}
