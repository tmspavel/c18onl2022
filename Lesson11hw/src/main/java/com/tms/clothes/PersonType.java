package com.tms.clothes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PersonType {
    MAN(IManClothes.class), WOMAN(IWomanClothes.class);

    private final Class iClass;

}
