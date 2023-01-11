package com.tms.threads;

public class MyInfiniteThread extends Thread {

    public MyInfiniteThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started");
        try {
            methodInterrupted();
        } catch (InterruptedException e) {
            System.out.println("interrupted " + e);
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " ended");
    }

    private void methodInterrupted() throws InterruptedException {
        int i = 0;
        while (!isInterrupted()) {
            System.out.println("Iteration " + i++);
            Thread.sleep(500);
        }
    }
}
