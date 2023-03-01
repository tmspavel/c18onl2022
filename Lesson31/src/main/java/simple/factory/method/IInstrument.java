package simple.factory.method;

public interface IInstrument {

    enum Type {
        GUITAR, DRUM, TRUMPET
    }

    String KEY = "До мажор"; //в интерфейсах можно объявлять статические переменные

    void play();

    default void test() {
        System.out.println("default");
    }

    Type getType();
}
