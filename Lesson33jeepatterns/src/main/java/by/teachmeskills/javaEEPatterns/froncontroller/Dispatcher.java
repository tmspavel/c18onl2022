package by.teachmeskills.javaEEPatterns.froncontroller;

public class Dispatcher {

    private HomeView homeView;
    private EmployeeView employeeView;

    public Dispatcher() {
        homeView = new HomeView();
        employeeView = new EmployeeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("employee")) {
            employeeView.showEmployeeView();
        } else {
            homeView.showHomeView();
        }
    }
}
