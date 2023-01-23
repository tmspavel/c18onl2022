package com.tms;

import com.tms.store.Consumer;
import com.tms.store.Producer;
import com.tms.store.Store;
import com.tms.storev2.ConsumerV2;
import com.tms.storev2.ProducerV2;
import com.tms.storev2.StoreV2;
import com.tms.threads.CountThread;
import com.tms.threads.MyInfiniteRunnable;
import com.tms.threads.MyInfiniteThread;
import com.tms.threads.MyRunnable;
import com.tms.threads.MyThread;

public class Main {
    public static void main(String[] args) {
//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
//        t.stop();
//
//        System.out.println("!!");
//        try {
//            if (5 > 2) {
//                System.exit(0);
//            }
//            Thread t = Thread.currentThread();
//            System.out.println(t.getName());
//            t.stop();
//        } finally {
//            System.out.println("finally");
//        }

//        createAndStartThreadExample();

//        createAndStartThreadsExample();

//        joinExample();

//        infiniteRunnableExample();

//        infiniteThreadExample();

//        raceConditionExample();

//        daemonExample();

//        producerConsumerExample();

        producerConsumerExampleV2();
    }


    private static void createAndStartThreadExample() {
        System.out.println("Main started");
        Thread myThread = new MyThread("custom 1");
//        myThread.run();
        myThread.start();
        myThread = new Thread(new MyRunnable(), "custom 2");
        myThread.start();
        System.out.println("Main ended");
    }

    private static void createAndStartThreadsExample() {
        System.out.println("Main started");
        for (int i = 0; i < 100; i++) {
            new MyThread("Thread #" + i).start();
        }
        System.out.println("Main ended");
    }

    private static void joinExample() {
        System.out.println("Main started");
        Thread myThread = new MyThread("custom 1");
        myThread.start();
        Thread myThread2 = new MyThread("custom 2");
        myThread2.start();
//        try {
//            myThread.join();
//            myThread2.join();
//        } catch (InterruptedException e) {
//            System.out.println("interrupted");
//        }

        System.out.println("Main ended");
        System.out.println("Main ended");
    }

    private static void infiniteRunnableExample() {
        System.out.println("Main started");
        MyInfiniteRunnable runnable = new MyInfiniteRunnable();
        new Thread(runnable, "infinite thread").start();
        try {
            Thread.sleep(1500);
            runnable.disable();
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("Main ended");
    }

    private static void infiniteThreadExample() {
        System.out.println("Main started");
        Thread t = new MyInfiniteThread("infinite thread");
        t.start();
        try {
            Thread.sleep(1500);
            t.interrupt();
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("Main ended");
    }

    private static void daemonExample() {
        Thread t = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println("thread: " + i++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finish demon thread");

            }
        });
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main: " + i);
        }
        if (t.isAlive()) {
            System.out.println("isAlive demon thread");
        }
    }

    private static void raceConditionExample() {
        CommonResource commonResource = new CommonResource();
        for (int i = 0; i < 5; i++) {
            new CountThread("Thread " + i, commonResource).start();
        }
    }

    private static void producerConsumerExample() {
        Store store = new Store(3);
//        Store store = new Store(2);
        new Producer(store, 7).start();
        new Consumer(store, 4).start();
        System.out.println("Product left in the store:" + store.getGoodsCounter());
    }

    private static void producerConsumerExampleV2() {
        StoreV2 store = new StoreV2(2);
        new ProducerV2(store, 7).start();
        new ConsumerV2(store, 5).start();
    }

}
