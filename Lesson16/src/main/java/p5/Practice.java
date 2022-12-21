package p5;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://ru.stackoverflow.com/questions/568119/Отличие-arraylist-от-linkedlist
 * https://javarush.ru/quests/lectures/questsyntax.level08.lecture05
 */
public class Practice {
    public static void main(String[] args) {
        {
            Set<Integer> objects = new HashSet<>();
            objects.add(new Integer(2));
            objects.add(new Integer(2));
            objects.add(4232323);
            objects.add(null);
            objects.add(1);
            System.out.println(objects);
            System.out.println(objects.equals(new HashSet<>(objects)));
            System.out.println(objects.remove(new Object()));
            System.out.println(objects);
        }

        {
            Set<String> objects = new LinkedHashSet<>();
            objects.add("1000");
            objects.add(null);
            String obg = create();
            if (obg != null) {
                objects.add(obg);
            }
            objects.add("2");
            System.out.println(objects);
            for (String object : objects) {
                if (object != null) {
                    System.out.println(object.length());
                }
            }

            objects.stream()
                    .filter(Objects::nonNull)
                    .forEach(object -> {
                        System.out.println(object.length());
                    });

            ArrayList<String> arrayList = new ArrayList(objects);
            System.out.println(arrayList.get(0));

        }

        List<Integer> list = new ArrayList();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(2);
        Integer integer = list.get(0);//4
//        O(n*m)
//        for (Integer integer : list) {
//            for () {
//
//            }
//            System.out.println(integer);
//        }
//        O(1)
        list.get(20);

        System.out.println(list);


        List<Integer> collect1 = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect1);

        Set<Integer> collect = list.stream()
                .collect(Collectors.toSet());
        System.out.println(collect);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(1);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(2);
        priorityQueue.offer(3);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque();
        arrayDeque.add(1);
        arrayDeque.addFirst(10);
        arrayDeque.add(20);
        arrayDeque.addLast(11);
        System.out.println(arrayDeque);


        List<String> objects = new LinkedList<>();
//        objects.

        List<String> arrayList = new ArrayList<>();
        arrayList.add("222");
//        arrayList.add(getString());
//        arrayList.get(3);
//        Iterator<String> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (next != null) {
//                String[] s = next.split(" ");
//                System.out.println(s);
//            }
//        }

        ListIterator<String> stringListIterator = arrayList.listIterator();
        stringListIterator.add("12344");
        System.out.println(arrayList);

        int i = 0;

//        List<String> strings = new ArrayList<>();
//
//        for (String s : arrayList) {
//            if (s.equals("222")) {
//                arrayList.remove(s);//
//            } else {
//                strings.add(s);
//            }
//        }
        arrayList.stream()
                .filter(s -> !s.equals("222"))
                .forEach(System.out::println);
    }

    private static String create() {
        if (5 > 10) {
            return "asd";
        }
        return null;
    }
}


//        for (int i = 0; i <arrayList.size(); i++) {
//            if (i == 1) {
//                arrayList.remove(arrayList.get(i));
//            }
//        }
//        System.out.println(arrayList);
//}

//        System.out.println(arrayList);
//    }

//    private static String getString() {
//        int i = 0;
//        if (i > 10) {
//            return "!!!";
//        }
//        return null;
//    }
//}
