package practice;

public class Test {
    public static void main(String[] args) {
        System.out.println("1");
        //1) через интерфейс
        FirstThread firstThread = new FirstThread();
//        firstThread.run();//не стартует
        Thread thread = new Thread(firstThread, "FirstThread");
        thread.start();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("abc");

        //2) через наследование
        SecondThread secondThread = new SecondThread("SecondThread");
        secondThread.start();//стартует поток
        System.out.println("111");

//        Thread.sleep(200000);
    }
}
