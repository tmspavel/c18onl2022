package counter;

public class IncrementThread extends Thread {

    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            counter.increment();
        }
    }
}
