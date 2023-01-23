package thread;

public class SimpleThread extends Thread {

    private final TimeWaitingThread timeWaitingThread;

    public SimpleThread(String name, TimeWaitingThread timeWaitingThread) {
        super(name);
        this.timeWaitingThread = timeWaitingThread;
    }

    @Override
    public void run() {
        System.out.println("timeWaitingThread " + timeWaitingThread.getName() + " " + timeWaitingThread.getState());
    }
}
