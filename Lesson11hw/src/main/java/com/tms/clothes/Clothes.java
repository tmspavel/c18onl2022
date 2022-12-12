package com.tms.clothes;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder()
@Getter
public abstract class Clothes {
    private Size size;
    private int cost;
    private String color;

    @ToString
    @Getter
    public enum Size {
        XXS(32),
        XS(34) {
            @Override
            public String getDescription() {
                return "детский размер";
            }
        },
        S(36),
        M(38),
        L(40);

        private final int euroSize;

        Size(int euroSize) {
            this.euroSize = euroSize;
        }

        public int getEuroSize() {
            return euroSize;
        }

        public String getDescription() {
            return "взрослый размер";
        }
    }

    public enum Type {
        CRAVAT, PANTS, SKIRT, TSHIRT, TEST
    }
}
