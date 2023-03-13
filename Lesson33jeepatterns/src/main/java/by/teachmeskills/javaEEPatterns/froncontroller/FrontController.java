package by.teachmeskills.javaEEPatterns.froncontroller;

public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public void dispatchRequest(String request) {
        trackRequest(request);

        if (isAuthenticatedUser()) {
            dispatcher.dispatch(request);
        }
    }

    private boolean isAuthenticatedUser() {
        System.out.println("User has successfully authenticated.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Request: " + request);
    }
}
