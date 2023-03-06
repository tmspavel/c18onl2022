package structural.bridge;

public class StoreApplication extends structural.bridge.Program {

    public StoreApplication(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Store application is developing...");
        developer.writeCode();
    }
}
