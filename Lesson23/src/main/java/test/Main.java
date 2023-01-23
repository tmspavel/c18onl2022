package test;

public class Main {

    public static void main(String[] args) {
        //main поток
        Runnable testThread = new TestThread();//второстепенный поток - выпонлняется параллельно
        Thread thread = new Thread(testThread);
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start TestThread");
                System.out.println("start TestThread");
                System.out.println("start TestThread");
                System.out.println("start TestThread");
            }
        }).start();

        new Thread(() -> {
            System.out.println("start TestThread");
            System.out.println("start TestThread");
            System.out.println("start TestThread");
            System.out.println("start TestThread");
        }).start();
    }
}
