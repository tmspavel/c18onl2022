package p4;

import p3.Address;
import p3.Person;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

public class Practice extends Person {

    public static final String TEMP = "c:\\temp";
    public static final List<String> PASSENGER_TYPES = List.of("ADT", "CHD", "INF");
    public static final Person PERSON = new Person();

    public static void main(String[] args) {

        List<String> objects = new ArrayList<>();
//        Person person3 = Person.builder()
//                .address(new Address("sdfds"))
//                .build();
        Person person2 = new Person(new Address("address"));
        person2.setAge(12);
        List<String> stringList2 = new ArrayList<>();
        stringList2.add("33");
        person2.setStringList(stringList2);
        person2.getInfo();


        PASSENGER_TYPES.add("12");
        PASSENGER_TYPES.add("13");
        PASSENGER_TYPES.add("14");
        String type = "ADT";
        if (PASSENGER_TYPES.contains(type)) {
            System.out.println("");
        }

        //"02-02-2023T12:23" - //"02-02-2023T15:23"
        //MSQ - "+3" O(1)
        //DME - "+3"

        List<String> list = new ArrayList<>();
        list.add("sdf");
        list.add("sdf");
        list.add("sdf");
        List<String> stringList1 = Arrays.asList("sd", "sd");
        stringList1.add("2323");

        List<String> stringList = List.of("1", "2");//new ArrayList<>();
//        stringList.add("1");
        Map<String, List<Person>> objectObjectHashMap = new HashMap<>();
//        "Алекс" -  "1, 2 ,3"
//        objectObjectHashMap.put(stringList, "Ivan");

        Map<String, String> map = new HashMap<>();
        map.put("MSQ", "+3");
        map.put("DME", "+3");
        System.out.println(map);
        map.remove("MSQ");
        map.put("MSQ", "+7");
        System.out.println(map);


        list.add("123");
        for (String s : list) {
            System.out.println(s);
        }
        list.stream()
                .forEach(str -> {
                            if (str.equals("123")) {
                                System.out.println(str);
                            } else {
                                System.out.println("Ничего");
                            }
                        }
                );

        list.stream().forEach(System.out::println);

        List<Integer> result = new ArrayList<>();
        int[] massiv = new int[]{1, 2, 3, 4};
        for (int i = 0; i < massiv.length; i++) {
            if (filterData(massiv[i])) {
                result.add(massiv[i]);
            }
        }
        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("B");
        System.out.println(containsA.and(containsB).test("ABCD"));

        Map<Integer, String> collect = IntStream.of(1, 2, 3, 4, 1011)
                .filter(Practice::filterData)
                .filter(value -> value < 100)
                .boxed()
                .collect(toMap(integer -> integer, Object::toString));


        System.out.println(collect);


        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Nikolay", 4, "male");
        person1.setStringList(List.of("sdf", "sdf"));
        personList.add(person1);
        personList.add(new Person("Alex", null, "male"));
        personList.add(new Person("Alex", 9, "male"));

        personList.stream()
                .flatMap(person -> person.getStringList().stream())
                .anyMatch(s -> true);
//                .forEach(System.out::print);


//        Stream<String> distinct = personList.stream()
//                .map(Person::getName)
//                .sorted()
//                .distinct();
//        distinct.collect(Collectors.toList());

//        Optional<Integer> maxPersonAge = findMaxPersonAge(personList);
//        if (maxPersonAge.isPresent()) {
//            Integer maxAge = maxPersonAge.get();
//            System.out.println(maxAge);
//        }
//        Integer maxPersonAge = findMaxPersonAge(personList);
//        if (maxPersonAge != null) {
//            System.out.println(maxPersonAge.hashCode());
//        }

//        getPersonAges(personList);

        //

//        maxPersonAge.ifPresent(System.out::println);

//        Optional.empty();

//        System.out.println(collect);


        //list.forEach(System.out::println);

//        list.forEach(System.out::println);

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        Random rnd = new Random();
//        System.out.println(min.orElseGet(()->rnd.nextInt(100)));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        Optional<Person> min = personList.stream().findFirst();

        final Consumer<Person> consumer = v -> {
            v.setAge(v.getAge() + 100);
        };
        Consumer<Person> integerConsumer = v -> {
            System.out.println(v);
        };
        min.ifPresentOrElse(
                consumer.andThen(integerConsumer),
                () -> System.out.println("Value not found")
        );

//        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
////        printUpperCase.accept("hello");
//
//        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());
//        printUpperCase.andThen(printLowerCase).accept("Hello world");
    }

    private static void test() {

    }

    private RuntimeException createException(String message) {
        return new RuntimeException(message);
    }


    private static Integer getPersonAges(List<Person> personList) {
        return personList.stream()
                .map(Person::getAge)
                .filter(Objects::nonNull)
                .filter(age -> age > 10)
                .max((o1, o2) -> o1.compareTo(o2))
                .orElseThrow(() -> new RuntimeException("dasfdasf"));
//                .orElseGet(Collections::emptyList);


//        for (Person person : personList) {
//            if (person.getAge() > 10) {
//                return person.getAge();
//            }
//        }
//        return null;

//                .orElseGet();
//                .orElseThrow();
//        if (max.isPresent()) {
//            if (max.get() > 10) {
//                return max;
//            }
//        }
//        return Optional.empty();
    }


    private static boolean filterData(int value) {
        return value > 3;
    }


}
