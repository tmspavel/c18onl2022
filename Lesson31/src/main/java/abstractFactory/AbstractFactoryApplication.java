package abstractFactory;

public class AbstractFactoryApplication {

    public static void main(String[] args) throws Exception {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        FurnitureAbstractFactory factory = configuration.setUpFactory(args[0]);

        Chair chair = factory.createChair();
        chair.sitOn();

        CoffeeTable coffeeTable = factory.createCoffeeTable();
        coffeeTable.putCup();

        Sofa sofa = factory.createSofa();
        sofa.lieOn();
    }
}
