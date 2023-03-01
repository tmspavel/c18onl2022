package abstractFactory;

public class VictorianCoffeeTable implements CoffeeTable {

    @Override
    public void putCup() {
        System.out.println("Cup is put on beautiful Victorian table!");
    }
}
