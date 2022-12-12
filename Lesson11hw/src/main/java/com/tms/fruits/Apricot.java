package com.tms.fruits;

import lombok.experimental.SuperBuilder;

import static com.tms.fruits.TypeFruit.APRICOT;

@SuperBuilder
public class Apricot extends Fruit {

    @Override
    TypeFruit getType() {
        return APRICOT;
    }
}
