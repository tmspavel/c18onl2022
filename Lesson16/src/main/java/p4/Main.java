package p4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> objects3 = new ArrayList<>(2);
        objects3.add("1");
        objects3.add("1");
        objects3.add("1");

//        new Account(12, new Integer(5));
        Account<Integer> account = new Account<>("12", 5);
        new Account("12", 5.6);
        new Account("12", 5L);
//        new Account("12", "5L");
//        new Account(new Person(), new Integer(5));
//        persons
        Set<String> strings1 = new HashSet<>();
        strings1.add("1");
        strings1.add("1");
        System.out.println(strings1);
//        strings1.add("1");
//        strings1.add("1");
        List<String> objects = new ArrayList<>(strings1);
        objects.add("1");
        objects.add("1");
        objects.add("1");
        System.out.println(objects);


//        for (String object : objects) {
//            System.out.println(object);
//        }
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            String value = objects.get(i);
            if (i > 2) {
                temp.add(value);
            }
//            objects.remove(i);
            System.out.println(value);
        }
        System.out.println(temp);
//
//        for (Iterator<String> iterator = objects.iterator(); iterator.hasNext(); ) {
//            String next = iterator.next();
//            System.out.println(next);
//        }

        objects.add("123");
        objects.add("125");
        objects.add("127");
        objects.add("1");
        objects.add(1, "2323");

        for (String object : objects) {
            System.out.println(object);
            objects.remove(object);// не правильное!
        }

        Iterator<String> iterator = objects.iterator();
//        String next = iterator.next();
//        System.out.println(next);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //if () {
            iterator.remove();
            //}
        }
        ArrayList<Object> objects2 = new ArrayList<>();
        for (String object : objects) {
            System.out.println(object);
//            objects.remove(object);// не правильное!
            if (4 > 5) {
                objects2.add(object);
            }
        }
        System.out.println(objects2);

        System.out.println("objects isEmpty " + objects.isEmpty());

//        for (String object : objects) {
//            System.out.println(object);
//        }

        Set<String> sets = new HashSet<>();
        List<String> stringList = List.of("12", "23");
        sets.add("12");
        sets.add("15");
        sets.add("16");

        List<String> strings = new ArrayList<>(sets);
        strings.get(0);

        Iterator<String> iteratorSet = sets.iterator();
        while (iteratorSet.hasNext()) {
            System.out.println(iteratorSet.next());
            iteratorSet.remove();
        }
        System.out.println(sets.isEmpty());

        List<String> objects1 = new LinkedList<>();
        ListIterator<String> stringListIterator = objects1.listIterator();

    }
}
