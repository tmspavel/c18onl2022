package by.home.structural.facade;

public class Developer {

    public void develop(by.home.structural.facade.BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is running");
        } else {
            System.out.println("Developer is developing project");
        }
    }
}
