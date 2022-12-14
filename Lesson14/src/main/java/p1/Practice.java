package p1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

    private final static Pattern PATTERN = Pattern.compile("(\\d+)([a-z]+)(\\d+)");

    public static void main(String[] args) {


//        System.out.println("\\".split());


        //? = 1 - она может быть а может и не быть в строке
        //* = 1*0 - 0 раз или более
        //+ = 1+0 - 1 раз или более
        //{5} = 1110000111111 11111
        //{5,} = 111
        //{5,7} = 1111111

//        "[a-яА-Я]" 10.1233
//        Pattern compile = Pattern.compile("(\\d+)([a-z]+)(\\d+)");
//        "привет"

        Matcher matcher = PATTERN.matcher("111111abasda222");
//        Matcher matcher2 = pattern.matcher("111abasda111");

//        System.out.println(matcher.matches());//на всю строку

//        System.out.println(matcher.find());


        while (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));

//            System.out.println(matcher.group());
        }

//        System.out.println(matcher.start() + " " + matcher.end());


        System.out.println(matcher.replaceAll("_WILDCARD_$2$3"));
        System.out.println(matcher.find());


        System.out.println(new String("".getBytes()).matches("\\d?"));//

        String str = "sdfsdf, sdfsdf, sdfsdf";
        String[] strings = str.split("\\.");
        String s = "\\\\";
        System.out.println(s);
        System.out.println("sdf123sdf?+4556hhh".replaceAll("\\d+\\+\\?", " "));
        System.out.println(Arrays.toString("sdf sdf hhh".split("\\d+")));
        method();
    }

    private static void method() {
        Pattern compile = Pattern.compile("(\\d+)([a-z]+)(\\d+)");
        Matcher matcher = PATTERN.matcher("341abasda322");
    }
}
