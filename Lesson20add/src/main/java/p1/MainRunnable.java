package p1;


public class MainRunnable implements Runnable {

    @Override
    public void run() {
        method();
    }

    private void method() {
        System.out.println("start MainRunnable " + Thread.currentThread().getName());
    }

}
