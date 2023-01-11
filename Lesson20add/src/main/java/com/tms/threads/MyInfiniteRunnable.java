package com.tms.threads;

public class MyInfiniteRunnable implements Runnable {
    private boolean isActive = true;

    public void disable() {
        System.out.println("disabled");
        isActive = false;
    }

    @Override
    public void run() {
        System.out.println("Runnable " + Thread.currentThread().getName() + " started");
        int i = 0;
        while (isActive) {
            System.out.println("Iteration " + i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
        System.out.println("Runnable " + Thread.currentThread().getName() + " ended");
    }
}
