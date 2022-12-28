package date_api;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Practice3 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, 2017);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        calendar.set(Calendar.HOUR_OF_DAY, 22);
        calendar.set(Calendar.MINUTE, 18);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 100);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone().getID());
        //уменьшаем месяц на 2
        calendar.add(Calendar.MONTH, -2);

        System.out.println(calendar.getTime());

        System.out.println(calendar.get(Calendar.DATE));//день
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//день
        System.out.println(calendar.get(Calendar.MONTH));//месяц
    }
}
