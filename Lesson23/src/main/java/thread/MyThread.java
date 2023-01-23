package thread;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        //NEW
        System.out.println("Состояние когда поток созднан но не запущен " + getState());
    }

    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Unexpected exception " + e.getMessage());
        } finally {
            //TERMINATED
            System.out.println(getState());
        }
    }
}
