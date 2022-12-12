package heads;

import abs.RobotParts;

public class SonyHead extends RobotParts implements IHead {

    public SonyHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }
}
