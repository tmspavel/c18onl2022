package legs;

import abs.RobotParts;

public class SonyLeg extends RobotParts implements ILeg {

    public SonyLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Sony сделала шаг");
    }
}