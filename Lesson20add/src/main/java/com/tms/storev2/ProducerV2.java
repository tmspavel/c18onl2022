package com.tms.storev2;

public class ProducerV2 extends Thread {
    private final StoreV2 store;
    private int goodsToPutCount;

    public ProducerV2(StoreV2 store, int goodsToPutCount) {
        this.store = store;
        this.goodsToPutCount = goodsToPutCount;
    }

    @Override
    public void run() {
        while (goodsToPutCount-- > 0) {
            store.put();
        }
    }
}
