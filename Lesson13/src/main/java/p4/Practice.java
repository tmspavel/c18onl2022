package p4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

    public final static Pattern PATTERN = Pattern.compile("(\\d+)([a-z]+)(\\d+)");

    public static void main(String[] args) {


//        System.out.println("\\".split());


        //? = 1 - она может быть а может и не быть в строке
        //* = 1*0 - 0 раз или более
        //+ = 1+0 - 1 раз или более
        //{5} = 1110000111111 11111
        //{5,} = 111
        //{5,7} = 1111111

//        "[a-яА-Я]"
//        Pattern compile = Pattern.compile("(\\d+)([a-z]+)(\\d+)");
//        "привет"

//        +375 29 7234234
        Matcher matcher = PATTERN.matcher("111111abasda222 1111kkk33");
//        Matcher matcher2 = pattern.matcher("111abasda111");

//        System.out.println(matcher.matches());//на всю строку

//        System.out.println(matcher.find());


//        int i = 1;
        while (matcher.find()) {
//            System.out.println(matcher.group(i));
//            System.out.println(matcher.group(2));
//            System.out.println(matcher.group(3));
//            i++;
            System.out.println(matcher.group());
        }

//        System.out.println(matcher.start() + " " + matcher.end());


        System.out.println(matcher.replaceAll("_WILDCARD_$2$3"));
        System.out.println(matcher.find());


        System.out.println(new String("".getBytes()).matches("\\d?"));//

        String str = "sdfsdf, sdfsdf, sdfsdf";
        String[] strings = str.split("\\.");
        String s = "\\\\";
        System.out.println(s);
        System.out.println("sdf?123+4556hhh".replaceAll("\\d+\\+\\?", " "));
        System.out.println(Arrays.toString("sdfs1212dfdf@mail.ru234234hhh".split("\\d+", 1)));
        method();
    }

    private static void method() {
        Pattern compile = Pattern.compile("(\\d+)([a-z]+)(\\d+)");
        Matcher matcher = PATTERN.matcher("341abasda322");
    }
}
