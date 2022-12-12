package com.tms.figure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        figures.add(Rectangle.builder()
                .firstSide(12.3)
                .secondSide(5.4)
                .build());
        figures.add(Circle.builder()
                .radius(13)
                .build());
        figures.add(Line.builder()
                .length(2)
                .build());
        figures.add(Triangle.builder()
                .base(8)
                .height(12.3)
                .build());

        for (Figure figure : figures) {
//            for (Class<?> anInterface : figure.getClass().getInterfaces()) {
//                if (anInterface == IFigure.class) {
//                    printSquare((IFigure)figure);
//                }
//            }

            if (figure.getType() != Type.LINE) {
                printSquare(figure);
            } else {
                System.out.println("Площадь фигуры для линии не вычисляется");
            }
        }
    }

    private static void printSquare(Figure figure) {
        System.out.println(figure.getType() + " Площадь = " + ((IFigure) figure).getSquare());
    }
}
