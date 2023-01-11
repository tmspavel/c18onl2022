package practice;

public class SecondThread extends Thread {

    public SecondThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("SecondThread run");
    }
}
