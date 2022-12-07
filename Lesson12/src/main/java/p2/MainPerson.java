package p2;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Иван", 23);
        System.out.println(person);
        Person person1 = person;
//        Person person1 = new Person(person.getName(), person.getAge());

        Person clonePerson = person.clone();
//        clonePerson.setAge(25);
        System.out.println(clonePerson);

        System.out.println(person == clonePerson);
        System.out.println(person.equals(person1));
//        "".equals(12)

//        person2.setAge(25);


//        System.out.println(person2);
    }
}
