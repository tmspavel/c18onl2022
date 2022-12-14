package p00;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

    public final static Pattern PATTERN = Pattern.compile("(\\d+)([a-z]+)(\\d+)");

    public static void main(String[] args) {

        //455dfdf666
        String s1 = """
                who "\"the\"heck\" is quux anyway
                """;

//        System.out.println("\\".split());
//        "bbbbbbab"
//                "Егор Алла Александра"


        //? = 1 - она может быть а может и не быть в строке
        //* = 1*0 - 0 раз или более
        //+ = 1+0 - 1 раз или более

        //{5} = 1110000111111 11111
        //{5,} = 111
        //{5,7} = 111111111111111111111111

//        "[a-яА-Я]"
//        Pattern compile = Pattern.compile("(\\d+)([a-z]+)(\\d+)");
//        "привет"
        //A12343232323

//        +375 29 7234234

//        Иванов-Петров
        //

        //валидация!
        System.out.println(Pattern.matches("([а-яА-Я]+)-?([а-яА-Я]+)", "Иванов-Петров"));

        String[] mass = {"Сидоров", "Иванов-Петров"};
        for (String str : mass) {
            if (str.contains("-")) {
                System.out.println(str.split("-")[1]);
            }
        }


        Pattern pattern = Pattern.compile("(\\d+)([a-z]+)(\\d+)");
        Matcher matcher = pattern.matcher("111111abcabasda2221111mmm");
        if (matcher.find()) {
            String str = matcher.group(1);
            System.out.println(str);
            String replacedStr = str.replace("a", " ");
            System.out.println(replacedStr);
        }


//        Matcher matcher2 = pattern.matcher("111abasda111");

//        System.out.println(matcher.matches());//на всю строку

        //"aaa12"
//        System.out.println(matcher.find());


        while (matcher.find()) {
            System.out.println(matcher.group());
        }

//        System.out.println(matcher.start() + " " + matcher.end());


        System.out.println(matcher.replaceAll("_WILDCARD_$2$3"));
        System.out.println(matcher.find());


        System.out.println(new String("".getBytes()).matches("\\d?"));//

        String str = "sdfsdf, sdfsdf, sdfsdf";
        String[] strings = str.split("\\.");
        String s = "\\\\";
//        привет как дела
        System.out.println(s);//9
        System.out.println("sdf?123+4556hhh".replaceAll("\\d+\\+\\?", " "));
        System.out.println(Arrays.toString("sdfs1212dfdf@mail.ru234234hhh".split("\\d+", 1)));
        method1();
    }

    private static void method1() {
        Pattern compile = Pattern.compile("(\\d+)([a-z]+)(\\d+)");
//        Matcher matcher = PATTERN.matcher("341abasda322");
    }
}
