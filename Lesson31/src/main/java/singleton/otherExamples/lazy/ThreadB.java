package singleton.otherExamples.lazy;

public class ThreadB implements Runnable {

    @Override
    public void run() {
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
    }
}
