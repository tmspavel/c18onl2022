package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                "Pixel 2");

        phones.stream()
                .filter(p -> p.length() < 12)
                .sorted(Comparator.reverseOrder()) // сортировка по возрастанию
                .forEach(s -> System.out.println(s));


        //2
//        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
//                new Phone("Pixel 2", "Google", 500),
//                new Phone("iPhone 8", "Apple", 450),
//                new Phone("Nokia 9", "HMD Global", 150),
//                new Phone("Galaxy S9", "Samsung", 300));
//
//        phoneStream.sorted((a, b) -> a.getName().compareToIgnoreCase(b.getName()))
//                .forEach(p -> System.out.printf("%s (%s) - %d \n",
//                        p.getName(), p.getCompany(), p.getPrice()));

//        сортирует объекты по полю name
    }
}

class PhoneComparator implements Comparator<Phone> {
    public int compare(Phone a, Phone b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
