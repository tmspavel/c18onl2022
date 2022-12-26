package p6;

import p4.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1L, "тойота", "белый", 1000);
        Car car2 = car;
        System.out.println(car.equals("тойота"));
        System.out.println(car.equals(null));
        System.out.println(car.equals(car2));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2L, "тойота", "белый", 1000));
        cars.add(new Car(3L, "москвич", "красный", 300));

        System.out.println(cars.contains(new Car(2L, "тойота", "белый", 1000)));

        System.out.println(car.hashCode() == car2.hashCode());

        Map<String, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("1", 1233);
        objectObjectHashMap.put("2", 55);
        objectObjectHashMap.put("3", 66);

        Integer value = objectObjectHashMap.get("1");

        for (String key : objectObjectHashMap.keySet()) {
            System.out.println(key);
        }

        for (Map.Entry<String, Integer> entry : objectObjectHashMap.entrySet()) {
            System.out.println(entry.getValue() + entry.getKey());
        }


        Map<String, List<Person>> map = new HashMap<>();
        ArrayList<Person> value1 = new ArrayList<>();
        map.put("Александр", value1);
        Map<String, Integer> map2 = new HashMap<>();

        System.out.println(value);
        System.out.println(value);

        List<Person> alexList = map.get("Александр");
        alexList.size();
        for (List<Person> people : map.values()) {
            for (Person person : people) {//
                System.out.println(person);
            }
        }

    }
}
