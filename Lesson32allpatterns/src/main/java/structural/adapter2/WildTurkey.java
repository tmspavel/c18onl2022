package structural.adapter2;

public class WildTurkey implements structural.adapter2.Turkey {

    @Override
    public void gobble() {
        System.out.println("WildTurkey is gobbling");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey is flying");
    }
}
