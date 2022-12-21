package p2;

public class Main {
    public static void main(String[] args) {
        GenericPrint<String> numberGenericClass = new GenericPrint<>("12.4");
        numberGenericClass.print();

        GenericPrint<Integer> numberGenericClass1 = new GenericPrint<>(12);
        numberGenericClass1.print();
    }
}
