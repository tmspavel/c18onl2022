package com.tms.fruits;

import java.util.List;

public class FruitShop implements ShopAware {

    private List<Fruit> fruits;

    public FruitShop(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public void toSell() {
        int count = 0;
        double resultCost = 0.0;
        for (Fruit fruit : fruits) {
            System.out.println("тип = " + fruit.getType());
            System.out.println("Цена фрукта за килограмм = " + fruit.getPricePerKilogram());
            System.out.println("Масса фруктов = " + fruit.getWeight());
            System.out.println("Стоимость = " + fruit.getFullPrice());
            System.out.println();
            resultCost += fruit.getFullPrice();
            count++;
        }
        System.out.println("Продано фруктов = " + count);
        System.out.println("Всего заплатили за фрукты = " + resultCost);
    }

    @Override
    public double getAllPrices() {
        return 0;
    }
}
