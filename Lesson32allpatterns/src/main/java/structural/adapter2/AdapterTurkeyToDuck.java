package structural.adapter2;

public class AdapterTurkeyToDuck implements structural.adapter2.Duck {

    structural.adapter2.Turkey turkey;

    public AdapterTurkeyToDuck(structural.adapter2.Turkey turkey) {
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
