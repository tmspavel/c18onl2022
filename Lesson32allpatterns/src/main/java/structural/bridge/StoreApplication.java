package by.home.structural.bridge;

public class StoreApplication extends by.home.structural.bridge.Program {

    public StoreApplication(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Store application is developing...");
        developer.writeCode();
    }
}
