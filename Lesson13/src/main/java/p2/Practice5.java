package p2;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
        String s3 = new String("aeqwerty");

        System.out.println(s3.startsWith("aq"));
        String phoneNumber = "+37529123155";
        if (phoneNumber.startsWith("+375")) {
            System.out.println("Беларусь");
        }
        if (phoneNumber.endsWith("55")) {
            System.out.println("asdasd");
        }


        System.out.println(s3.lastIndexOf("e"));

        System.out.println(s3.indexOf('i'));
        System.out.println(s3.indexOf("er", 1));//начиная с индекса искать строку
        System.out.println(s3.indexOf("er", 3));
        System.out.println("qwertyab".lastIndexOf("ab"));
        System.out.println("abqwertyab".indexOf("ab"));
        System.out.println(s3.indexOf(97));

        //new StringBuilder();
        //new StringBuffer();

        System.out.println("asdtttt".startsWith("asd"));
        System.out.println(s3.endsWith("cab"));


        s3 = "abcabcab";
        System.out.println(s3.replace("a", "f"));
        System.out.println(s3.replace("abc", "???"));
        System.out.println(s3.replaceFirst("abc", "???"));

        //trim - убирает пробелы в начале и конце
        s3 = " \tabca bcab\t    ";
        System.out.println("|" + s3 + "|");
        System.out.println("|" + s3.trim() + "|");

        s3 = "heLLo. can you hear me. I was wondering ...";
        System.out.println(s3.replace(" ", ""));

        //substring
        s3 = "hello";
        System.out.println(s3.substring(0, 1)); //ello
        System.out.println(s3.substring(1, 4)); //ell
        System.out.println(s3.toLowerCase());//hello
        System.out.println(s3.toUpperCase());//HELLO

        String[] s333 = "heLLo\\\\ can you hear me. I was wondering . ..".split("\\\\\\\\");

        String[] strings = s3.split("!");

        System.out.println(Arrays.toString(strings));

    }
}
