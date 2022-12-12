package p2;

public class Practice4 {
    public static void main(String[] args) {
        //сравнение сторок
        String s1 = "string";
        String s3 = new String("s");
        //сравниваются по символьно в алфавитном порядке по таблице юникод
        System.out.println(s1.compareTo(s3));

        //-1 0 1

        System.out.println(s1.compareTo("a")); //s1 > "a"


        System.out.println(s1.compareTo("w"));
        System.out.println(s1.compareTo("strings"));//длина учитывается

        s1.equals(s3);

        //сравнить подстроки 2 строк
        System.out.println("sd".regionMatches(0, "123456sd", 6, 2));
        //индекс первой строки, вторая строка, с какого симвоола и сколько симоволов

        System.out.println("sd".regionMatches(true, 0, "123456SD", 6, 2));


    }
}
