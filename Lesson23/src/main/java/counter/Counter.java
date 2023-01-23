package counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private AtomicInteger count = new AtomicInteger(0);
//    private final Object LOCK = new Object();

    public void increment() {//монитор объекта(у всех объектов один монитор)
//        synchronized (LOCK) {
        count.incrementAndGet();
//        count = count + 1;
//        }
    }

    public void decrement() {
//        synchronized (LOCK) {
//            count--;
//        }
    }

    public int getCount() {
        return count.get();
    }
}
