package by.teachmeskills.javaEEPatterns.froncontroller;

public class Application {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("employee");
        frontController.dispatchRequest("home");
    }
}
