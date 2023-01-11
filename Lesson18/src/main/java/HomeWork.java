import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

//https://www.baeldung.com/java-calculate-factorial#:~:text=Factorial%20Using%20a%20for%20Loop,for%20numbers%20up%20to%2020.
public class HomeWork {
    /**
     * Основное задание
     * 1. Написать программу для вывода на консоль названия дня недели по
     * введенной дате.
     * 2. Написать программу для вывода на экран дату следующего вторника.
     * <p>
     * Дополнительное задание
     * 3. Создать обобщенный функциональный интерфейс.
     * Написать класс с одним методом.
     * В этом методе реализуйте логику:
     * - если в консоль введена цифра 1, то: использования интерфейса со
     * строковым типом и передать в метод интерфейса логику реверса
     * строки(вывода строки в обратном порядке).
     * - если в консоль введена цифра 2, то: использования интерфейса с
     * целочисленным типом и передать в метод интерфейса логику
     * нахождения факториала числа.
     */
    public static void main(String[] args) {

        //1
        {
            String date = "2023-01-02T05:23:11";
            LocalDateTime localDate = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
            System.out.println(localDate);
            System.out.println(localDate.getDayOfWeek());
        }

        //2
        {
            LocalDate date = LocalDate.now();
            System.out.println("\nСледующий вторник: " + date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
            System.out.println("Предыдущий вторник: " + date.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)) + "\n");
        }

        //3
        findDay(3, 29, 1991);
    }

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("RU")));
        return dayOfWeek.toString();
    }

}
