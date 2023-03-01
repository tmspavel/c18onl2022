package singleton.otherExamples;

public class StaticInitializationSingleton {

    private static final StaticInitializationSingleton instance;

    private StaticInitializationSingleton() {
    }

    static {
        try {
            instance = new StaticInitializationSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticInitializationSingleton getInstance() {
        return instance;
    }

}
