package decorator;

public class SportBike implements Bike {

    private Bike bike;

    public SportBike(Bike bike) {
        this.bike = bike;
    }

    @Override
    public int getSpeed() {
        return this.bike.getSpeed() + 60;
    }

    @Override
    public int getHisWeight() {
        return this.bike.getHisWeight() + 10;
    }
}