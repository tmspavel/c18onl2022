package by.tms.services;

import by.tms.model.Address;
import by.tms.model.Person;
import by.tms.model.Person2;

public class Main {
    public static void main(String[] args) {
//        int[] ints = new int[];

        Person person = new Person();//объект человека(экземпляр класса)
        person.age = 23;
        person.name = "Николай";

        System.out.println(person.age + " " + person.name);

        Person person1 = new Person(35);
        Person person3 = new Person(36, "Nik");
        System.out.println(person3.age + " " + person3.name);

        Person person4 = new Person(67, "Михаил", new Address("Минск"));
        System.out.println(person4);

        Person person2;// не создали объект.
        person2 = new Person();


        Person2 person21 = new Person2(3, "sdf");
        Person2 person2333 = new Person2(5, "sdf333");
//        Person2 person22 = new Person2();

    }
}
