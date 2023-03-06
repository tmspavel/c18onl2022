package structural.decorator2;

public class Whip extends structural.decorator2.CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.3;
    }

    @Override
    public String getDescription() {
        return beverage.description + " , Whip";
    }
}
