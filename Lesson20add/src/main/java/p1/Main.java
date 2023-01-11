package p1;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread1 = new Thread("myThread-" + i) {
                @Override
                public void run() {
                    System.out.println("1");
                }
            };
            thread1.start();
        }


        //1
        Thread myThread = new Thread("myThread") {
            @SneakyThrows
            @Override
            public void run() {
                Thread.sleep(120 * 1000);
                System.out.println("myThread");
            }
        };
        myThread.start();

        MainRunnable mainRunnable = new MainRunnable();
        new Thread(mainRunnable).start();
        //jProfiler

        //2
        Runnable runnable = () -> System.out.println("myRunnable");
        Thread thread = new Thread(runnable);
        thread.start();


        new Thread(new MainRunnable(), "123").start();

//        System.out.println("start Main");
//        Thread thread1 = new Thread("thread1") {
//            @Override
//            public void run() {
//                System.out.println("thread1");
//            }
//        };
//        System.out.println(thread1.getName());
////        thread1.setPriority(10);
//        thread1.start();
////        thread1.join();
//        System.out.println("end Main");
//        Thread thread2 = new Thread("thread2") {
//            @Override
//            public void run() {
//                System.out.println("thread2");
//            }
//        };
//        thread2.setPriority(1);
//
//        thread1.start();
//        thread2.start();


//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("старт Runnable");
//            }
//        };
////        runnable.run();//нет
//        Thread thread = new Thread(runnable);
//        thread.start();


        for (int i = 0; i < 5; i++) {
            MainThread mainThread = new MainThread(i);
            mainThread.start();
        }


//        System.out.println("старт майн потока");
//        Thread thread1 = new Thread("кастомный поток"){
//            @Override
//            public void run() {
//                System.out.println("поток 1 стартовал");
//                try {
//                    Thread.sleep(30*1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        thread1.start();
//
//
//        try {
//            Thread.sleep(20*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("end майн потока");

//        Thread thread = new Thread("поток 1") {
//            @Override
//            public void run() {
//                System.out.println("поток 1 стартовал");
//            }
//        };
////        thread.start();
//        thread.run();
    }
}
