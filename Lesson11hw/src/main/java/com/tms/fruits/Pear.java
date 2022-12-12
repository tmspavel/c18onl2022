package com.tms.fruits;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Pear extends Fruit {
    @Override
    public double getFullPrice() {
        return super.getFullPrice() + 10;
    }

    @Override
    TypeFruit getType() {
        return TypeFruit.PEAR;
    }
}
