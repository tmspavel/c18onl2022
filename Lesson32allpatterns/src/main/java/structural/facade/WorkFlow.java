package by.home.structural.facade;

public class WorkFlow {

    private by.home.structural.facade.BugTracker bugTracker = new by.home.structural.facade.BugTracker();
    private by.home.structural.facade.Job job = new by.home.structural.facade.Job();
    private Developer developer = new Developer();

    public void workFlow() {
        job.doJob();
        bugTracker.finishSprint();
        developer.develop(bugTracker);
    }
}
