package date_api;

import java.util.Date;

public class Practice1 {
    /**
     * https://ru.wikipedia.org/wiki/Unix-время
     * JODA
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Date().getTime());

        Date date = new Date(Integer.MAX_VALUE);//25 января 1970
        System.out.println(date);
        System.out.println(new Date(0));//1 января 1970
        System.out.println(new Date(24 * 60 * 60 * 1000));//+1 день
        System.out.println(new Date(1_095_292_800_000L));//16 сентября 2004
    }

}
