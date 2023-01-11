package p1;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    private static volatile int value = 1;

    public static void increase() {
//        atomicInteger.incrementAndGet();
        value = value * 2;
    }

    private static void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        processSomething(j);
                        increase();
//                        System.out.println(Thread.currentThread().getName() + " " + atomicInteger.get());
                        System.out.println(Thread.currentThread().getName() + " " + value);
                    }
                }
            });
            list.add(thread);
            thread.start();
        }
        for (Thread thread : list) {
            thread.join();
        }


//        while (Thread.activeCount() > 1)
//            Thread.yield();
//        System.out.println("!!!" +atomicInteger.get());
        System.out.println("!!!" + value);
    }
}
