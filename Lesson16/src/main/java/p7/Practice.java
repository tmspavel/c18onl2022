package p7;

import p4.Person;

import java.util.*;

/**
 * https://habr.com/ru/post/421179/
 * https://devcolibri.com/hashmap-и-hashset-что-это-на-самом-деле/
 */
public class Practice {
    public static void main(String[] args) {
//        Map<Key, Integer> map = new HashMap<>();
//        Key key = new Key("vishal");
//        map.put(key, 20);
//        map.put(new Key("sachin"), 30);
//        map.put(new Key("vaibhav"), 40);
//
//
//
//        System.out.println(map.get(key));
////        key.key = "1vishal";
//        System.out.println(map.get(key));
//        System.out.println("!!");
//
////        System.out.println(map.put(vaibhav, 100));
//
////        ((HashMap.Node[]);).;
//        System.out.println(map);
//
//        ArrayList<String> arrayList = new ArrayList();
//        arrayList.add("13323");
//        arrayList.add("13");
//        arrayList.add("1");
//
        Person[] people = {new Person(1L, "Nik", 45), new Person(1L, "Ivan", 12)};
//        Arrays.sort(people);

//        TreeSet<Person> sortedSet = new TreeSet<>();
//        sortedSet.add(new Person(1L, "Nik", 45));//
//        sortedSet.add(new Person(1L, "Nik", 45));//
//        sortedSet.add(new Person(1L, "Nik", 45));
//        sortedSet.add(new Person(1L, "Nik", 45));
//        Person nik = new Person(1L, "Nik", 45);
//        sortedSet.add(nik);
//        sortedSet.add(new Person(1L, "Ivan", 12));
//        sortedSet.add(new Person(1L, "Ivan", 12));
//        sortedSet.add(new Person(1L, "Ivan", 12));
//        sortedSet.add(new Person(1L, "Ivan", 12));
//        System.out.println(sortedSet);


//        Arrays.sort(people
////                new Comparator<Person>() {
////            @Override
////            public int compare(Person o1, Person o2) {
////                return Integer.compare(o1.getAge(), o2.getAge());
////            }
////        }
//        );
//
//        System.out.println(Arrays.toString(people));
//
//


        Person[] people1 = {new Person(1L, "Nik", 45), new Person(1L, "Ivan", 12)};
//        Arrays.sort(people1);
//        for (Person person : people1) {
//            System.out.println(person);
//        }

        Arrays.stream(people)
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);
//
        List<String> arrayList = new ArrayList<>();

        Map<String, Person> stringStringTreeMap = new TreeMap<>();
        stringStringTreeMap.put("5", new Person(1L, "sdfsdf", 3));
        stringStringTreeMap.put("2", new Person(2L, "hhh", 5));
        stringStringTreeMap.put("1", new Person(3L, "hhh", 5));
        stringStringTreeMap.put("8", new Person(4L, "hhh", 5));

        System.out.println(stringStringTreeMap);


//        int compare(T o1, T o2);
        Comparator<String> compareTo = String::compareTo;
        Collections.sort(arrayList, compareTo);

//        System.out.println(arrayList);
//
//        System.out.println();
//        System.out.println("Value for key sachin: " + map.get(new Key("sachin")));
////        System.out.println("Value for key vaibhav: " + map.get(vaibhav));
//
//        for (Map.Entry<Key, Integer> keyIntegerEntry : map.entrySet()) {
////            keyIntegerEntry.getKey();
////            keyIntegerEntry.getValue();
//            System.out.println(keyIntegerEntry.getKey().key + " " + keyIntegerEntry.getValue());
//        }
    }

    private static void test(List<String> arrayList) {

    }
}
