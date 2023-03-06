package behavioral.template2;

public class Tea extends Beverage {

    @Override
    void brew() {
        System.out.println("Brew tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Add lemon and sugar");
    }
}
