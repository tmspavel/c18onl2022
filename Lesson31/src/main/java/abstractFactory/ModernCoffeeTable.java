package abstractFactory;

public class ModernCoffeeTable implements CoffeeTable {

    @Override
    public void putCup() {
        System.out.println("Cup is put on small Modern coffee table!");
    }
}
