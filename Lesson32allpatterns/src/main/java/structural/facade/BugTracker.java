package structural.facade;

public class BugTracker {

    private boolean sprint;

    public boolean isActiveSprint() {
        return sprint;
    }

    public void startSprint() {
        System.out.println("Sprint is going");
        sprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is finished");
        sprint = false;
    }
}
