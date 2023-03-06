package structural.facade;

public class WorkFlow {

    private structural.facade.BugTracker bugTracker = new structural.facade.BugTracker();
    private structural.facade.Job job = new structural.facade.Job();
    private Developer developer = new Developer();

    public void workFlow() {
        job.doJob();
        bugTracker.finishSprint();
        developer.develop(bugTracker);
    }
}
