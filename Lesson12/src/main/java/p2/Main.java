package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Person firstPerson = new Person("Alex", 25);
//        System.out.println(firstPerson.hashCode());
//        System.out.println(firstPerson.hashCode());
//        System.out.println(firstPerson.hashCode());
        Person secondPerson = new Person("Alex", 25);
        System.out.println(secondPerson.hashCode());


        Person newPerson;
        newPerson = secondPerson;

        newPerson = new Person("", 23);
        newPerson.setAge(secondPerson.getAge());
        newPerson.setName(secondPerson.getName());
        System.out.println(secondPerson);
        System.out.println(newPerson);

        newPerson.setAge(30);

        System.out.println(secondPerson);
        System.out.println(newPerson);


        System.out.println(secondPerson.getAge());
        System.out.println(newPerson.getAge());


//        secondPerson.equals(newPerson);//true
//        firstPerson.equals(secondPerson);//false
//
//        System.out.println(secondPerson.hashCode() == newPerson.hashCode());
//        System.out.println(firstPerson.hashCode() == newPerson.hashCode());
//        System.out.println(firstPerson.equals(newPerson));
//        System.out.println(secondPerson.equals(firstPerson));

        System.out.println(secondPerson.equals(getPerson(null)));

//        if (firstPerson.getName().equals(newPerson.getName()) && firstPerson.getAge() == newPerson.getAge()) {
//            System.out.println("persons equals");
//        }

        System.out.println(secondPerson.getClass().getSimpleName());
        System.out.println(secondPerson.getClass().getName());
        System.out.println(secondPerson.getClass());
        System.out.println(secondPerson.getClass());
        System.out.println(Arrays.toString(secondPerson.getClass().getAnnotations()));


        System.out.println("_________");


        Person p1 = new Person("", 34);
        p1.setName("Test");
        System.out.println(p1);
        Person p2 = new Person("Test", 12);

        p2 = p1;
        p2 = new Person(p1.getName(), p1.getAge());
        p1.setName("Николай");
        System.out.println(p1);
        System.out.println(p2);


//        Person2 personNext = new Person2("Test");

//        System.out.println(personNext.hashCode() == p1.hashCode());
//        System.out.println(personNext.equals(p1));//

        System.out.println("a1 " + p1.hashCode());
        System.out.println("p2 " + p2.hashCode());

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1 == p2);//сылка

//        int i = 3;
//        int b = 3;
//        if (i == b) {
//
//        }


//        Person p3 = null;
//        System.out.println(p1.equals(p3));

        Person alex = new Person("Alex", 35);


        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Николай", 23));
        persons.add(new Person("Alex", 23));
        persons.add(alex);

        for (Person person : persons) {
            if (person.getAge() == alex.getAge() && person.getName().equals(alex.getName())) {
                System.out.println("yes");
            }
            if (person.equals(alex)) {
                System.out.println("yes");
            }
        }

        System.out.println(persons.contains(alex));//содержится ли


        if (p1.equals(p2)) {
            System.out.println("p1 equals p2");
        } else {
            System.out.println("p1 not equals p2");
        }

        if (p1 == p2) {
            System.out.println("!!!");
        } else {
            System.out.println("1111");
        }
    }

    private static Person getPerson(Person firstPerson) {
        //логика
//        if (Objects.nonNull(firstPerson)) {
//
//        }
        return null;
    }
}
