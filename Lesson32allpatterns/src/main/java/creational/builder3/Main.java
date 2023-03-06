package creational.builder3;

public class Main {

    public static void main(String[] args) {
        Person person = new creational.builder3.PersonBuilderImpl()
                .withName("Ivan")
                .withSurName("Ivanov")
                .age(25)
                .build();
        System.out.println(person);
    }
}
