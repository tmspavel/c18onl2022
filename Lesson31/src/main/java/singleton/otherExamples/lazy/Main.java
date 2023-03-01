package singleton.otherExamples.lazy;

public class Main {

    public static void main(String[] args) {
//        ThreadA threadA = new ThreadA();
//        new Thread(threadA).start();
//
//        ThreadB threadB = new ThreadB();
//        new Thread(threadB).start();

        for (int i = 0; i < 100; i++) {
            ThreadB threadB = new ThreadB();
            new Thread(threadB).start();
        }
    }
}
