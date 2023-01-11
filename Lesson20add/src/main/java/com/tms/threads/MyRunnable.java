package com.tms.threads;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable " + Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("Runnable " + Thread.currentThread().getName() + " ended");
    }
}
