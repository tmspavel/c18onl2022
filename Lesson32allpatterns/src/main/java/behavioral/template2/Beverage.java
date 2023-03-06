package behavioral.template2;

public abstract class Beverage {

    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boil water");
    }

    void pourInCup() {
        System.out.println("Pour in cup");
    }
}
