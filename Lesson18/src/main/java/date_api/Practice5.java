package date_api;

import java.time.*;

public class Practice5 {
    public static void main(String[] args) {
        /**
         * Java8. Date API
         *  {@link LocalDate} - дата без времени и временных зон
         *  {@link LocalTime} - время без даты и временных зон
         *  {@link LocalDateTime} - дата и время без временных зон
         *  {@link ZonedDateTime} - дата и время с временной зоной
         *  {@link java.time.format.DateTimeFormatter} - форматирует дату в строки и наоборот только для java.time
         *  {@link Instant} - количество секунд с 1 января 1970
         *  {@link Duration} - продолжительность в секундах и наносекундах
         *  {@link Period} - период времени в годах, месяцах и днях
         *  {@link java.time.temporal.TemporalAdjuster} - корректировщик дат(может получить дату следующего понедельника)
         */
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
//
//        //задать дату
        System.out.println(LocalDate.of(2021, Month.AUGUST, 12));
        System.out.println(LocalDate.of(2021, 2, 12));
        System.out.println(LocalDate.ofYearDay(2021, 350));
        //задать время
        System.out.println(LocalTime.ofNanoOfDay(1_000_000_000_000L));
//        //задать дату и время
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));

        System.out.println(ZonedDateTime.now());

        //операции над датой
        {
            LocalDateTime now = LocalDateTime.now();
            System.out.println("NOW :" + now);
            System.out.println(now.minusMonths(2));
            System.out.println(now.minusDays(1));
        }

        //сравнение дат
        {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime nowMinusDay = now.minusDays(1);

            System.out.println(now.isAfter(nowMinusDay));
            System.out.println(nowMinusDay.isBefore(now));
        }


    }
}
