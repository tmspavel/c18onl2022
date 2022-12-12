package com.tms.clothes.utils;

import com.tms.clothes.*;
import com.tms.clothes.Clothes.Type;

import java.math.BigDecimal;
import java.util.ArrayList;

import static com.tms.clothes.Clothes.Size.*;
import static com.tms.clothes.Clothes.Type.*;
import static com.tms.clothes.PersonType.MAN;
import static com.tms.clothes.PersonType.WOMAN;

public class ClothesMain {
    public static void main(String[] args) {
        ArrayList<Clothes> clothesArrayList = new ArrayList<>();
//        clothesArrayList.add(createClothes(TEST, "красный", XXS, 50));
        clothesArrayList.add(createClothes(CRAVAT, "синий", XS, 6));
        clothesArrayList.add(createClothes(SKIRT, "жёлтый", S, 50));
        clothesArrayList.add(createClothes(TSHIRT, "чёрный", M, 7));
        Atelier atelier = new Atelier(clothesArrayList);
        atelier.dress(MAN);
        atelier.dress(WOMAN);

        BigDecimal price;
        try {
            price = new BigDecimal("sds");
        } catch (Exception exception) {
            System.out.println("неверный формат данных");
        }

    }

    private static Clothes createClothes(Type type, String color, Clothes.Size size, int cost) {
        return switch (type) {
            case PANTS -> Pants.builder()
                    .color(color)
                    .cost(cost)
                    .size(size)
                    .build();
            case SKIRT -> Skirt.builder()
                    .color(color)
                    .cost(cost)
                    .size(size)
                    .build();
            case CRAVAT -> Cravat.builder()
                    .color(color)
                    .cost(cost)
                    .size(size)
                    .build();
            case TSHIRT -> TShirt.builder()
                    .color(color)
                    .cost(cost)
                    .size(size)
                    .build();
            default -> throw new IllegalArgumentException("неверный тип данных");
        };
    }
}
