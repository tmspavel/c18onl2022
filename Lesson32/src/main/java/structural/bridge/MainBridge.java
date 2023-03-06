package by.home.structural.bridge;

public class MainBridge {

    public static void main(String[] args) {
        by.home.structural.bridge.Program[] programs = {new by.home.structural.bridge.BankApplication(new JavaDeveloper()), new by.home.structural.bridge.StoreApplication(new PhpDeveloper())};
        for (by.home.structural.bridge.Program program : programs) {
            program.developProgram();
        }
    }
}
