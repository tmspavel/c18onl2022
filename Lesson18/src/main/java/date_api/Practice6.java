package date_api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

//https://www.digi.com/resources/documentation/digidocs/90001437-13/reference/r_iso_8601_duration_format.htm
public class Practice6 {
    public static void main(String[] args) {
        //работа с периодом. разница в днях
        {
            LocalDate localDate = LocalDate.now();
            LocalDate localDate1 = localDate.minusDays(5);

            System.out.println(Period.between(localDate1, localDate));//старт и енд дата
            System.out.println(Period.between(localDate1, localDate).getDays());
        }
        {
            //таже роль. но измеряется в часах минутах секундах
            LocalDate localDate = LocalDate.now();
            LocalDate localDate1 = localDate.minusDays(5);
            LocalDateTime localDateTime = localDate1.atStartOfDay();
            LocalDateTime localDateTime1 = localDateTime.plusMinutes(-20);
            System.out.println(Duration.between(localDateTime1, localDate.atStartOfDay()));//старт и енд дата
            System.out.println(Duration.between(localDateTime1, localDate.atStartOfDay()).toDays());
        }
    }
}
