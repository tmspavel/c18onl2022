package p1;

import lombok.SneakyThrows;

public class FooVolatileMain {
    @SneakyThrows
    public static void main(String[] args) {
        FooVolatile fooVolatile = new FooVolatile();

        new Thread(fooVolatile, "fooVolatile-1").start();
        new Thread(fooVolatile, "fooVolatile-2").start();


        Thread.sleep(1000);
        long stoppedOn = System.nanoTime();
        fooVolatile.close();

        System.out.println("Stopping main thread on: " + stoppedOn);

    }
}
