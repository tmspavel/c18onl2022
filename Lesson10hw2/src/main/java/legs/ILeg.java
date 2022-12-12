package legs;

import abs.IPrice;

public interface ILeg extends IPrice {
    void step();
}
