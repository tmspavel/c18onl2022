package decorator;

public class StandardBike implements Bike {

    private int speed = 40;
    private int hisWeight = 90;

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getHisWeight() {
        return this.hisWeight;
    }

}