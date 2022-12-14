package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice2 {
    public static void main(String[] args) {
        String text = "Егор Алла Анна Александр";

        Pattern pattern = Pattern.compile("А.+?а");
        Matcher matcher = pattern.matcher(text);
//        matcher.find();
//        System.out.println(matcher.group(0));
        while (matcher.find()) {
            System.out.println(matcher.group());
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
        }
        System.out.println(matcher.replaceFirst("ИраИра"));
        System.out.println(matcher.replaceAll("Ольга"));
        System.out.println(text);
    }

}
