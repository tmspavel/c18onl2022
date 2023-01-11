package com.tms.storev2;

public class ConsumerV2 extends Thread {
    private final StoreV2 store;
    private final int goodsToReceiveCount;
    private int receivedGoodsCount = 0;

    public ConsumerV2(StoreV2 store, int goodsToReceiveCount) {
        this.store = store;
        this.goodsToReceiveCount = goodsToReceiveCount;
    }

    @Override
    public void run() {
        while (receivedGoodsCount++ < goodsToReceiveCount) {
            store.get();
        }
    }
}
