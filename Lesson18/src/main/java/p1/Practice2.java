package p1;

public class Practice2 {
    public static void main(String[] args) {
        /*
        Терминальные лямбда-выражения
        терминальные лямбды, которые не возвращают никакого значения. Например:
         */
        Printable printer = str -> System.out.println(str);
        printer.print("Hello Java!");
    }

    @FunctionalInterface
    interface Printable {
        void print(String s);
    }
}
