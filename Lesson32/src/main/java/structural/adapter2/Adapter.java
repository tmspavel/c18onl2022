package by.home.structural.adapter2;

public class Adapter {

    public static void main(String[] args) {
        by.home.structural.adapter2.Duck duck = new by.home.structural.adapter2.MallardDuck();
        duck.quack();
        duck.fly();
        by.home.structural.adapter2.Duck turkey = new by.home.structural.adapter2.AdapterTurkeyToDuck(new by.home.structural.adapter2.WildTurkey());
        turkey.fly();
        turkey.quack();
    }
}
