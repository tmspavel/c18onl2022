package thread;

import lombok.SneakyThrows;

public class BlockedService {

    private final Object object = new Object();

    @SneakyThrows
    public void serveThread(BlockedThread blockedThread) {
        synchronized (object) {
            System.out.println("Зашел " + blockedThread.getName() + " " + blockedThread.getState());
            printState(blockedThread);
            Thread.sleep(20000);
        }
    }

    @SneakyThrows
    private void printState(BlockedThread blockedThread) {
        for (BlockedThread allThread : blockedThread.getAllThreads()) {
            System.out.println(allThread.getName() + " " + allThread.getState());
        }
    }
}
