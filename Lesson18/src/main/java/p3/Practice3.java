package p3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Practice3 {
    public static void main(String[] args) {
        //Фильтрация. Метод filter
        List<Integer> result = new ArrayList<>();
        int[] massiv = new int[]{1, 2, 3, 4};
        for (int i = 0; i < massiv.length; i++) {
            if (filterData(massiv[i])) {
                result.add(massiv[i]);
            }
        }

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000, null),
                new Phone("Lumia 950", 45000, null),
                new Phone("Samsung Galaxy S 6", 40000, null));
        phoneStream.filter(p -> p.getPrice() < 50000)
                .forEach(p -> System.out.println(p.getName()));

        //Отображение. Метод map
        //Отображение или маппинг позволяет задать функцию преобразования одного объекта в другой,
        // то есть получить из элемента одного типа элемент другого типа.
        // Для отображения используется метод map, который имеет следующее определение:
        phoneStream
                .map(p -> p.getName()) // помещаем в поток только названия телефонов
                .forEach(s -> System.out.println(s));

        //Плоское отображение. Метод flatMap
        /*
        Плоское отображение выполняется тогда, когда из одного элемента нужно получить несколько. Данную операцию выполняет метод flatMap:
         */
        phoneStream
                .flatMap(p -> Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                        String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int) (p.getPrice() * 0.1))
                ))
//                .flatMap(phone -> phone.getPersons().stream())
//                .map(person -> person.getName())
                .forEach(s -> System.out.println(s));
//        for (Phone phone : phoneStream.collect(Collectors.toList())) {
//            for (Person person : phone.getPersons()) {
////                if()
//                System.out.println(person.getName());
//            }
//        }
    }

    private static boolean filterData(int value) {
        return value > 3;
    }
}
