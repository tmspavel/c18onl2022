package creational.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        creational.singleton.Singleton singleton = creational.singleton.Singleton.getInstance();
        singleton.setInstance();
    }

}

