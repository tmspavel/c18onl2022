package singleton.otherExamples;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Singleton {

    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
