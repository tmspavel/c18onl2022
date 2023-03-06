package by.teachmeskills.patterns.singleton;

import by.teachmeskills.patterns.singleton.otherExamples.StaticInitializationSingleton;

public class EagerApp {
    public static void main(String[] args) {
        StaticInitializationSingleton singleton1 = StaticInitializationSingleton.getInstance();
        StaticInitializationSingleton singleton2 = StaticInitializationSingleton.getInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
