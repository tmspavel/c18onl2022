package date_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {
    //https://javarush.ru/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar
    public static void main(String[] args) {
//        System.out.printf();
        //форматирование даты
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));

        String date = "2020-02-23T02:07:14";
        Date parseDate = null;
        try {
            parseDate = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parseDate);
    }
}
