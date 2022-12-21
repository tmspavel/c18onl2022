package p4;

public class Practice {
    public static void main(String[] args) {
        Iterable<String> myIterable = new MyIterable<>("a");

        for (String my : myIterable) {
            System.out.print(my);
        }
//        Person person = new Person();
//        for (String s : person) {
//
//        }

    }
}
