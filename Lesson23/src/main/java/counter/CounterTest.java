package counter;

import lombok.SneakyThrows;

public class CounterTest {

    @SneakyThrows
    public static void main(String[] args) {
        Counter counter = new Counter();
        //сылка - один объект в 2 разных потоках(какая будет проблема?)
        IncrementThread firstThread = new IncrementThread(counter);
        IncrementThread secondThread = new IncrementThread(counter);

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(counter.getCount());
    }

}
