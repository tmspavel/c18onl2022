package p2;

public class Main {
    public static void main(String[] args) {
        System.out.println("main");
        FirstThread firstThread = new FirstThread("FirstThread");
//        firstThread.run();
        firstThread.start();//старт firstThread

        try {
            firstThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SecondThread secondThread = new SecondThread();
//        secondThread.run();//не стартанет поток

        Thread thread = new Thread(secondThread);
        thread.start();//старт secondThread


        new Thread() {
            @Override
            public void run() {
                System.out.println("asdas");
            }
        }.start();

        new Thread(() -> System.out.println("start my Thread")).start();
        System.out.println("end");
    }
}
