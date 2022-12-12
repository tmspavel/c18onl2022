package p2;

import static java.lang.String.join;

public class Practice1 {
    public static final String delimiter = ",";

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str.concat("asd"));
        System.out.println("123" + "asd");


        String s = String.valueOf(12);
        String bb = String.valueOf(new Person());
        System.out.println(bb);

        System.out.println(s);
        String s1 = ",";
//        arr[i] + ", "

        System.out.println(join(delimiter, "23", "45"));
        System.out.println(join(", ", "23", "45"));
    }
}

class Person {

}
