package p1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1 {
    public static void main(String[] args) {
        {
            Pattern pattern = Pattern.compile("\\s?\\d+\\s?");
            String[] words = pattern.split("java5tiger 77 java6mustang");
            System.out.print(Arrays.toString(words));
        }
        System.out.println();
        {
            String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
            String s = "адреса эл.почты:ivanov@gmail.eu, sidorov@bsu.by!"; //.бел
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                System.out.println("e-mail: " + matcher.group());
            }
        }
    }
}
