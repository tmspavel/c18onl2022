package p2;

/**
 * Собственный класс, который работает с  объектом T (String, Long, и любые другие классы) типа.
 *
 * @param <T> - объект неизвестного класса
 */
public class GenericPrint<T> {
    private T value;// можем объявить как глобальную переменную

    public GenericPrint(T value) { //конструктор
        this.value = value;
    }

//    public String getValue(Object obj) {
//        return (String) obj;
//    }
//
//    public void print(String value) { //параметр метода
//        System.out.println(value.toString());
//    }

    public void print() {
        System.out.println(value);
    }
}
