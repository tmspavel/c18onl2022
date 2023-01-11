package com.tms.store;

//склад
public class Store {
    private int goodsCounter;//счетчик товаров
    private final int goodsLimit;//максимальное допустимое число товаров

    public Store(int goodsLimit) {
        this.goodsLimit = goodsLimit;
    }

    /**
     * метод для производителей
     *
     * @return 1 если товар добавили, 0 - иначе
     */
    synchronized int put() {
        if (goodsCounter < goodsLimit) {//если товаров меньше лимита
            goodsCounter++;//кладем товар
            System.out.println("Store has " + goodsCounter + " goods");
            return 1;
        }
        return 0;
    }

    /**
     * метод для покупателей
     *
     * @return 1 если взяли товар, 0 - иначе
     */
    synchronized int get() {
        if (goodsCounter > 0) {//если хоть один товар присутствует
            goodsCounter--;//берем товар
            System.out.println("Store has " + goodsCounter + " goods");
            return 1;
        }
        return 0;
    }

    public int getGoodsCounter() {
        return goodsCounter;
    }
}
