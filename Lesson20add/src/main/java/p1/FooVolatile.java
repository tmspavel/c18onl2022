package p1;

import lombok.SneakyThrows;

public class FooVolatile implements Runnable {
    private volatile boolean close = true;
    private int i = 1;

    Object object = new Object();

    public void close() {
        close = false;
        System.out.println("call close method");
    }

    @SneakyThrows
    @Override
    public void run() {
        while (close) {
//            System.out.println("1");
            i++;
//            System.out.println(Thread.currentThread().getName() +" work");
//            Thread.sleep(10);
//            if (this.getName().equals("Thread-0")) {
//                close = true;
//            }
        }
        System.out.println("> Stopped FooVolatile thread " + Thread.currentThread().getName() + " on: " + System.nanoTime());
    }


}
