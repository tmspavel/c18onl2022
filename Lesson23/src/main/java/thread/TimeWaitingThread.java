package thread;

import lombok.SneakyThrows;

public class TimeWaitingThread extends Thread {


    @SneakyThrows @Override
    public void run() {
        sleep(10000);
    }
}
