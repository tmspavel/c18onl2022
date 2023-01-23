package thread;

import java.util.ArrayList;
import java.util.List;
import lombok.SneakyThrows;

public class Main {

    /**
     * люди однопоточны. мы не можем делать сложные задачи параллельно
     *
     * @param args
     */
    @SneakyThrows
    public static void main(String[] args) {
//        Thread thread = Thread.currentThread();
//
//        System.out.println(thread.getName());
//        //RUNNABLE
//        System.out.println(thread.getState());
//        //поговорим про состояния(жизненый цикл)
//
//        System.out.println("!!!!!!!//количество состояний ");
//        System.out.println("количество состояний " + State.values().length);
//        Arrays.stream(State.values()).forEach(System.out::println);
//
//        System.out.println("-----------------------------");
//
//        MyThread myThread = new MyThread("my");//new состояние
//        myThread.start();
//        myThread.interrupt();
//        System.out.println("myThread" + myThread.getState());

        //BLOCKED
        List<BlockedThread> blockedThreads = new ArrayList<>();
        BlockedService service = new BlockedService();
        for (int i = 0; i < 5; i++) {
            BlockedThread blockedThread = new BlockedThread("b " + i, service);
            blockedThreads.add(blockedThread);
        }
        for (BlockedThread blockedThread : blockedThreads) {
            blockedThread.setAllThreads(blockedThreads);
            blockedThread.start();
        }
//
//        //WAITING
//        Thread main = Thread.currentThread();
//        WaitingThread timedWaitingThread = new WaitingThread("WaitingThread", main);
//        timedWaitingThread.start();
//        timedWaitingThread.join();
//        System.out.println(thread.getState());
//
//        //TIME_WAITING
//        TimeWaitingThread timeWaitingThread = new TimeWaitingThread();
//        timeWaitingThread.start();
//
//        Thread.sleep(1000);
//        new SimpleThread("simple", timeWaitingThread).start();
    }

}
