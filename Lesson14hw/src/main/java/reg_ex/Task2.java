package reg_ex;

import com.tms.utils.PatternUtils;

import java.util.regex.Matcher;

public class Task2 {
//    * По  регулярным выражениям!
//            * 2) Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение,
//            сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
//     * Должно вывести:
//     * cab
//     * ccab
//     * cccab

    public static void main(String[] args) {
        String text = "cab, ccab, cccab, cb";
        //думал на квантификаторах вывезу, но не всегда удаётся настроить правильно.
        //вообще именно по условию нам дана строка "cab, ccab, cccab", по условию никакого "cmb" там быть не должно
        //так что чисто по логике я справился, использовав "c.+?b" :)
        Matcher matcher = PatternUtils.PATTERN.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
