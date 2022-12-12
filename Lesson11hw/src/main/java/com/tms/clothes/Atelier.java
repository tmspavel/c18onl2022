package com.tms.clothes;

import java.util.ArrayList;

public class Atelier {

    private final ArrayList<Clothes> clothes;

    public Atelier(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }


    public void dressMan() {
        for (Clothes clothe : clothes) {
            if (clothe instanceof IManClothes) {
                ((IManClothes) clothe).dressMan();
            }
        }
    }

    public void dressWoman() {
        for (Clothes clothe : clothes) {
            for (Class in : clothe.getClass().getInterfaces()) {
                if (in == IWomanClothes.class) {
                    ((IWomanClothes) clothe).dressWoman();
                }
            }
        }
    }


    public void dress(PersonType personType) {
        for (Clothes clothes : clothes) {
            if (checkClothes(clothes, personType)) {
                switch (personType) {
                    case WOMAN -> ((IWomanClothes) clothes).dressWoman();
                    case MAN -> ((IManClothes) clothes).dressMan();
                }
            }
        }
    }

    private boolean checkClothes(Clothes clothes, PersonType personType) {
        for (Class anInterface : clothes.getClass().getInterfaces()) {
            if (anInterface == personType.getIClass()) {
                return true;
            }
        }
        return false;
    }
}
