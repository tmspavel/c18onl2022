package p2;

public class FirstThread extends Thread {

    public FirstThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
