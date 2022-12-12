package p2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Строки - последовательность символов(сылочный тип данных)
 */
public class Practice {
    public static void main(String[] args) {
        String s1 = null;
        s1 = "string";

        s1 = new String("string");

        String str = "string";
        String s6 = "string";

        String x = str + s6;
        System.out.println(x.hashCode());

        System.out.println("stringstring".hashCode());

//        "3748484848481" - "Иван"
        String s = "string";
        s = s + "123";//string123

        System.out.println(s);

        System.out.println(s1);
        String s2 = "";//что тут будет на консоли?
        System.out.println(s2);
        System.out.println("");

        System.out.println(s2.toString());
        String s3 = new String();
        System.out.println(s3);


        String s4 = new String(new char[]{'s', 't', 'r', 'i', 'n', 'g'});
        String s5 = new String(new byte[]{-48, -80, -48, -79, -47, -122});//абц

        System.out.println(s5);
        System.out.println(s4);
        System.out.println(s4.length());
        System.out.println("абц".length());//3

        byte[] bytes = s1.getBytes(StandardCharsets.UTF_8);
        System.out.println(new String(bytes));

        //более не прозрачная передача данных(пароль пользователя)
        System.out.println(Arrays.toString("абц".getBytes(StandardCharsets.UTF_8)));

        //не изменяемость(immutable объект)
        s4 = s5;
        System.out.println(s4);
        System.out.println(s5);

        if (s5 != null && s5.isBlank()) {

        }


        s5 = s5.replace("цsad", "fasd");
        System.out.println(s5);
        System.out.println(s4);//зачем надо делать так что бы нельзя было поменять?
        //ключ - значение


        String t1 = "123";

        String t2 = "123";

        t2 = "124";
        String t3 = new String("123");
        String t4 = new String("123");
        String t5 = "123";

        String ss = null;
        ss = t3;
        System.out.println(t3 == ss);//true
        System.out.println(t1 == t2);//true
        System.out.println(t1 == t3);//false
        System.out.println(t2 == t3);//false
        System.out.println(t3 == t4);//false


        //пул строк
        System.out.println("at");
        System.out.println("asd" == "asd");//true
        String asd = new String("ASD".getBytes());
        System.out.println("asd" == asd);//false
        System.out.println("asd".equalsIgnoreCase(asd));//true
        String intern = asd.intern();
        System.out.println("asd" == intern);//true

//        new String("678");
//        "678"

        String dd = new String("qw".getBytes());
        System.out.println();
        String internDD = dd.intern();
        String qw = "qw";
        System.out.println(qw.intern() == internDD);


        System.out.println("!!!");
        String myString = "123";
//        ==
        System.out.println(myString.equals("1234"));

        System.out.println();

    }

}
