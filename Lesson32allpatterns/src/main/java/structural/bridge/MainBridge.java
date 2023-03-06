package structural.bridge;

public class MainBridge {

    public static void main(String[] args) {
        structural.bridge.Program[] programs = {new structural.bridge.BankApplication(new JavaDeveloper()), new structural.bridge.StoreApplication(new PhpDeveloper())};
        for (structural.bridge.Program program : programs) {
            program.developProgram();
        }
    }
}
