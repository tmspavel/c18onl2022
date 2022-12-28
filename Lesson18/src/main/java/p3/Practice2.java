package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Practice2 {
    public static void main(String[] args) {
        /*
        default Stream<E> stream: возвращается поток данных из коллекции
        default Stream<E> parallelStream: возвращается параллельный поток данных из коллекции
         */

        ArrayList<String> cities = new ArrayList<>();
//        Stream.of("Париж", "Лондон", "Мадрид");

        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream() // получаем поток
                .filter(city -> city.length() == 6) // применяем фильтрацию по длине строки
                .map(s -> s.charAt(0))
                .forEach(s -> {
                    System.out.println(s);
                    System.out.println(s);
                    System.out.println(s);
                    System.out.println(s);
                }); // выводим отфильтрованные строки на консоль

//        Фактически жизненный цикл потока проходит следующие три стадии:
//        - Создание потока
//        - Применение к потоку ряда промежуточных операций
//        - Применение к потоку терминальной операции и получение результата
        {

            Stream<String> citiesStream = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"});
            citiesStream.forEach(s -> System.out.println(s)); // выводим все элементы массива

            IntStream intStream = Arrays.stream(new int[]{1, 2, 4, 5, 7});
            intStream.forEach(i -> System.out.println(i));

            LongStream longStream = Arrays.stream(new long[]{100, 250, 400, 5843787, 237});
            longStream.forEach(l -> System.out.println(l));

            DoubleStream doubleStream = Arrays.stream(new double[]{3.4, 6.7, 9.5, 8.2345, 121});
            doubleStream.forEach(d -> System.out.println(d));
        }
        //3
        {
            Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид");
            citiesStream.forEach(s -> System.out.println(s));

            String[] arrCities = {"Париж", "Лондон", "Мадрид"};
            Stream<String> citiesStream2 = Stream.of(arrCities);

            IntStream intStream = IntStream.of(1, 2, 4, 5, 7);
            intStream.forEach(i -> System.out.println(i));

            LongStream longStream = LongStream.of(100, 250, 400, 5843787, 237);
            longStream.forEach(l -> System.out.println(l));

            DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
            doubleStream.forEach(d -> System.out.println(d));
        }
    }
}
