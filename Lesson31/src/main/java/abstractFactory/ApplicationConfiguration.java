package abstractFactory;

public class ApplicationConfiguration {

    private final static String VICTORIAN_FACTORY_LABEL = "Victorian";
    private final static String MODERN_FACTORY_LABEL = "Modern";

    public FurnitureAbstractFactory setUpFactory(String factory) throws Exception {
        if (factory.equals(VICTORIAN_FACTORY_LABEL)) {
            return new VictorianFurnitureFactory();
        } else if (factory.equals(MODERN_FACTORY_LABEL)) {
            return new ModernFurnitureFactory();
        } else {
            throw new Exception("Error! Unknown factory!");
        }
    }
}
