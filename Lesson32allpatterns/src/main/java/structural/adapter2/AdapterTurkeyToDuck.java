package by.home.structural.adapter2;

public class AdapterTurkeyToDuck implements by.home.structural.adapter2.Duck {

    by.home.structural.adapter2.Turkey turkey;

    public AdapterTurkeyToDuck(by.home.structural.adapter2.Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
