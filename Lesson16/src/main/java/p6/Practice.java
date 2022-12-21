package p6;

import java.util.*;

public class Practice {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//
        Map<String, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("a", 1);
        objectObjectHashMap.put("b", 1445);
        objectObjectHashMap.put("c", 34);
        objectObjectHashMap.put(null, null);

        objectObjectHashMap.put("a", 23);
        System.out.println(objectObjectHashMap.get("a"));
        Integer nnn = objectObjectHashMap.get("nnn");
        if (nnn != null) {
            System.out.println(nnn.intValue());
        }
        System.out.println(nnn);
        Set<String> strings = objectObjectHashMap.keySet();
        System.out.println(strings);
        Collection<Integer> values = objectObjectHashMap.values();
        findValue(new ArrayList<>(values));
//
//        for (Person p: persons)


        for (Map.Entry<String, Integer> stringIntegerEntry : objectObjectHashMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }


        Set<Car> carSet = new HashSet<>();
        Car car1 = new Car("бмв", "красный", 5000);
        carSet.add(car1);
        Car car2 = new Car("бмв", "красный1", 5000);
        carSet.add(car2);
        Car car3 = new Car("бмв", "красный", 15000);
        carSet.add(car3);
        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode() == car2.hashCode());

        //если equals = true то хешкоды обязаны быть равными
        //если equals = false то хешокоды могут быть не равны а могут быть равны (колизия)
//
//
        System.out.println(carSet);
//
        Map<Car, String> map = new HashMap<>();
//        Set<Car> cars = map.keySet();
        map.put(car1, "new HashMap<>()");
        map.put(car2, "car2");
        map.put(car3, "car3");
        System.out.println(map);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("1", "asfdsf");
        stringMap.put("1", "lll");
        System.out.println(stringMap);


    }

    static void findValue(List<Integer> strings) {
        for (Integer string : strings) {
            System.out.println(string);
        }
    }
}
