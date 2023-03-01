package abstractFactory;

public class ModernChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Sit on not comfortable moder chair!");
    }
}
