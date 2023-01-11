package p1;

public class MainThreadTest {
    public static void main(String[] args) {
        //инструкции
        System.out.println("1123");
        System.out.println("1123");
        System.out.println("1123");
        MainThread mainThread = new MainThread(1);
        mainThread.start();
        System.out.println("1123");
        System.out.println("1123");

        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("123");
            }
        }.start();

        System.out.println();
        new Thread(new MainRunnable()).start();

    }
}
