package singleton.otherExamples.lazy;

public class ThreadA implements Runnable {

    @Override
    public void run() {
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        System.out.println(lazyInitializedSingleton.hashCode());
    }
}
