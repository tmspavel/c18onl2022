package thread;

import lombok.SneakyThrows;

public class WaitingThread extends Thread {

    private Thread main;

    public WaitingThread(String name, Thread main) {
        super(name);
        this.main = main;
    }

    @SneakyThrows @Override
    public void run() {
        sleep(1000);
        System.out.println("State of main " + main.getName() + " " + main.getState());
        sleep(1000);
    }
}
