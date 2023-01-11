package com.tms.store;

//производитель
public class Producer extends Thread {
    private final Store store;
    private int goodsToPutCount;

    public Producer(Store store, int goodsToPutCount) {
        this.store = store;
        this.goodsToPutCount = goodsToPutCount;
    }

    @Override
    public void run() {
        try {
            while (goodsToPutCount > 0) {//пока у производителя имеются товары
                goodsToPutCount -= store.put();//кладем один товар на склад
                System.out.println(goodsToPutCount + " goods left to put");//осталось
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}
