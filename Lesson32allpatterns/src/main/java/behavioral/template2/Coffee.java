package behavioral.template2;

public class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Brew coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Add milk and sugar");
    }
}
