package creational.builder3;

public interface Builder {

    Builder withName(String name);

    Builder withSurName(String surname);

    Builder age(int age);

    Person build();
}
