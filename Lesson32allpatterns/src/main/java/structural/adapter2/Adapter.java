package structural.adapter2;

public class Adapter {

    public static void main(String[] args) {
        structural.adapter2.Duck duck = new structural.adapter2.MallardDuck();
        duck.quack();
        duck.fly();
        structural.adapter2.Duck turkey = new structural.adapter2.AdapterTurkeyToDuck(new structural.adapter2.WildTurkey());
        turkey.fly();
        turkey.quack();
    }
}
