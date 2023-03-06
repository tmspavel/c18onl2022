package creational.builder;

import java.util.Arrays;

public class MainBuilder {

    public static void main(String[] args) {
        Person person = new creational.builder.Person.Builder()
                .withName("Ivan")
                .withSurname("Ivanov")
                .withAddress("Belarus")
                .withAge(30)
                .withHobbies(Arrays.asList("Football", "Reading", "Programming"))
                .build();
        System.out.println(person);
    }
}
