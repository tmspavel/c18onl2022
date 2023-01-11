package com.tms.storev2;

public class StoreV2 extends Object {
    private int goodsCounter;
    private final int goodsLimit;

    public StoreV2(int goodsLimit) {
        this.goodsLimit = goodsLimit;
    }


    synchronized void put() {
        while (goodsCounter == goodsLimit) {
            try {
                System.out.println("Store is full");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        goodsCounter++;
        System.out.println("Store has " + goodsCounter + " goods after put");
        notify();
    }

    synchronized void get() {
        while (goodsCounter == 0) {
            try {
                System.out.println("Store is empty");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        goodsCounter--;
        System.out.println("Store has " + goodsCounter + " goods after get");
        notify();
    }
}
