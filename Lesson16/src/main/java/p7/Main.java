package p7;

import p4.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        Map<String, Person> stringStringTreeMap = new TreeMap<>();
        stringStringTreeMap.put("5", new Person(1L, "sdfsdf", 3));
        stringStringTreeMap.put("2", new Person(2L, "hhh", 5));
        stringStringTreeMap.put("1", new Person(3L, "hhh", 5));
        stringStringTreeMap.put("8", new Person(4L, "hhh", 5));

        System.out.println(stringStringTreeMap);

    }
}
