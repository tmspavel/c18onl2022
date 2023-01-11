package com.tms.store;

//поток покупателя
public class Consumer extends Thread {
    private final Store store;
    private final int goodsToReceiveCount;
    private int receivedGoodsCount = 0;

    public Consumer(Store store, int goodsToReceiveCount) {
        this.store = store;
        this.goodsToReceiveCount = goodsToReceiveCount;
    }

    @Override
    public void run() {
        try {
            while (receivedGoodsCount < goodsToReceiveCount) {
                receivedGoodsCount += store.get();//берем по одному товар со склада
                System.out.println("Received " + receivedGoodsCount + " goods");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
