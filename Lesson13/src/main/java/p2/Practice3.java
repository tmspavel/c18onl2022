package p2;

public class Practice3 {

    public static void main(String[] args) {
        String s1 = "string";
        String s3 = new String("qwerty");
        char[] dst = new char[3];
        s1.getChars(0, 2, dst, 1);
        System.out.println(dst);

        //объединение 2 строк
        String result = s1.concat(s3).concat("another").concat("2323");//s1 не изменится
        System.out.println(result);

        //сложение перегружено.
        System.out.println(s1 + s3 + "another");//через valueOf посмотреть


//        String.valueOf(3) + "3"
        System.out.println(1 + 2 + "3" + 4);//334
        System.out.println(1 + "2" + 3 + 4); //1234
        int index = 0;
        System.out.println("индекс моего массива = " + index + 1);//
//
        System.out.println(String.join(";", s1, "s2", s3, "custom"));
        String[] strings = {s1, null};
        doSmth(s1, "s2", null);
        doSmth(strings);

    }

    static void doSmth(String... s) {//работа как с массивом
        System.out.println(s.length);
        System.out.println(s[1]);
    }
}
