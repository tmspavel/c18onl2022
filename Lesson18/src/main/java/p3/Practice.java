package p3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
https://metanit.com/java/tutorial/10.1.php
 */
public class Practice {

    public static void main(String[] args) {
        /*
        Начиная с JDK 8 в Java появился новый API - Stream API.
        Его задача - упростить работу с наборами данных, в частности, упростить операции фильтрации,
        сортировки и другие манипуляции с данными.
        Вся основная функциональность данного API сосредоточена в пакете java.util.stream.
         */
        List<String> list = new ArrayList<>();
        list.add("123");
        for (String s : list) {
            System.out.println(s);
        }
        Stream<String> stream = list.stream();
        stream.filter(s -> !s.isBlank());

        stream.forEach(Practice::extracted);

        list.stream()
                .forEach(System.out::println);

        /*
        Операции:
        1) терминальными (terminal) - возвращают конкретный результат.
        2) промежуточными (intermediate) - возвращают трансформированный поток
         */

//        Phone phone = Phone.builder().build();

        int[] ints = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        List<Integer> boxed = IntStream.of(ints)
                .filter(value -> value > 0)
//                .map(Integer::new)
                .boxed()
                .collect(Collectors.toList());

//        List<Integer> result = new ArrayList<>();
//        for (int value : ints) {
//            if (value > 0) {
//                result.add(value);
//            }
//        }
//        return result;

//                .count();
//        System.out.println(count);
        //DoubleStream, IntStream, LongStream

        //!!!Все потоки производят вычисления, в том числе в промежуточных операциях,
        // только тогда, когда к ним применяется ТЕРМИНАЛЬНАЯ ОПЕРАЦИЯ.
        // То есть в данном случае применяется отложенное выполнение.

        /**
         * отличие коллекций от потоков:
         *
         * - Потоки не хранят элементы. Элементы, используемые в потоках, могут храниться в коллекции, либо при необходимости могут быть напрямую сгенерированы.
         *
         * - Операции с потоками не изменяют источника данных. Операции с потоками лишь возвращают новый поток с результатами этих операций.
         *
         * - Для потоков характерно отложенное выполнение. То есть выполнение всех операций с потоком происходит лишь тогда, когда выполняется терминальная операция и возвращается конкретный результат, а не новый поток.
         */
    }

    private static void extracted(String str) {
        if (str.equals("123")) {
            System.out.println(str);
        } else {
            System.out.println("Ничего");
        }
    }
}
