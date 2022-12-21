package p7;

import java.util.*;

/**
 * https://habr.com/ru/post/421179/
 * https://devcolibri.com/hashmap-и-hashset-что-это-на-самом-деле/
 */
public class Practice {
    public static void main(String[] args) {
        Map<Key, Integer> map = new HashMap<>();
        map.put(new Key("vishal"), 20);
        map.put(new Key("sachin"), 30);
        map.put(new Key("vaibhav"), 40);

//        System.out.println(map.put(vaibhav, 100));

//        ((HashMap.Node[]);).;
        System.out.println(map);

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("13323");
        arrayList.add("13");
        arrayList.add("1");

        arrayList.stream()
                .sorted()
                .forEach(System.out::println);

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(arrayList);

        System.out.println();
        System.out.println("Value for key sachin: " + map.get(new Key("sachin")));
//        System.out.println("Value for key vaibhav: " + map.get(vaibhav));

        for (Map.Entry<Key, Integer> keyIntegerEntry : map.entrySet()) {
//            keyIntegerEntry.getKey();
//            keyIntegerEntry.getValue();
            System.out.println(keyIntegerEntry.getKey().key + " " + keyIntegerEntry.getValue());
        }
    }
}
