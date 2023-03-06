package creational.builder3;

public class PersonBuilderImpl implements Builder {

    private final Person person = new Person();

    @Override
    public Builder withName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public Builder withSurName(String surname) {
        person.setSurname(surname);
        return this;
    }

    @Override
    public Builder age(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
