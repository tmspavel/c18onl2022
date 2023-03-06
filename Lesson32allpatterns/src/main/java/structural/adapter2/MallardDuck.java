package structural.adapter2;

public class MallardDuck implements structural.adapter2.Duck {

    @Override
    public void fly() {
        System.out.println("MallardDuck is flying");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck is quacking");
    }
}
