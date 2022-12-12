package com.tms.figure;

import lombok.experimental.SuperBuilder;

import static com.tms.figure.Type.LINE;

@SuperBuilder
public class Line extends Figure {

    private double length;

    @Override
    Type getType() {
        return LINE;
    }
}
