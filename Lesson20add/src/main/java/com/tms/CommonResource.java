package com.tms;

import java.util.concurrent.atomic.AtomicInteger;

//https://russianblogs.com/article/713112260/
public class CommonResource {
    public volatile AtomicInteger x = new AtomicInteger(0);
//    public Integer y = 0;

    //    public volatile Integer x = 0;
    private final Object lock = new Object();

    static void methodStatic() {
        synchronized (CommonResource.class) {

        }
    }

    public void increment() {
        synchronized (this) {
            System.out.println("!!!Зашел " + Thread.currentThread().getName());
            for (int i = 0; i < 5; i++) {
//                int b = 4;
//                x++;
                System.out.println(Thread.currentThread().getName() + " " + x.incrementAndGet());

                //атомарность
                //            Операция в общей области памяти называется атомарной,
                //            если она завершается в один шаг относительно других потоков,
                //            имеющих доступ к этой памяти. Во время выполнения такой операции над переменной,
                //            ни один поток не может наблюдать изменение наполовину завершенным.
                //            Атомарная загрузка гарантирует, что переменная будет загружена целиком в один момент времени.
                //            Неатомарные операции не дают такой гарантии.
                //            x++
                //1) считывает значение из памяти
                //2) увеличивает значение на 1
                //3) записывает значение в память
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
//            }
            }

//        synchronized (lock) {
//            x--;
//        }
        }
    }

}