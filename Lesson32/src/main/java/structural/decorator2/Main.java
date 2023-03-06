package by.home.structural.decorator2;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new by.home.structural.decorator2.Mocha(new by.home.structural.decorator2.Whip(new by.home.structural.decorator2.Espresso()));
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());
        Beverage beverage1 = new by.home.structural.decorator2.Whip(new by.home.structural.decorator2.HouseBlend());
        System.out.println(beverage1.getCost());
        System.out.println(beverage1.getDescription());
    }
}
