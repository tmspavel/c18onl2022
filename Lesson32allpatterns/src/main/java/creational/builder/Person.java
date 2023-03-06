package creational.builder;

import java.util.List;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String address;
    private List<String> hobbies;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    public static class Builder {

        private final Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder withAddress(String address) {
            newPerson.address = address;
            return this;
        }

        public Builder withHobbies(List<String> hobbies) {
            newPerson.hobbies = hobbies;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }

}
