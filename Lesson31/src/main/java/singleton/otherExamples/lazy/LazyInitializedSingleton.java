package singleton.otherExamples.lazy;

//thread safe singleton
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
        System.out.println(this.hashCode());
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyInitializedSingleton.class) {
                if (instance == null) {
                    instance = new LazyInitializedSingleton();
                }
            }
        }
        return instance;
    }
}
