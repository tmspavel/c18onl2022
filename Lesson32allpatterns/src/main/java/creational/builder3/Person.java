package creational.builder3;

public class Person {

    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

//    public static class MyBuilder {
//        private final Person myPerson;
//
//        public MyBuilder() {
//            this.myPerson = new Person();
//        }
//
//        public MyBuilder withName(String name) {
//            myPerson.name = name;
//            return this;
//        }
//
//       public MyBuilder withSurname(String surname) {
//            myPerson.surname = surname;
//            return this;
//        }
//
//       public MyBuilder withAge(int age) {
//            myPerson.age = age;
//            return this;
//        }
//
//       public Person build() {
//            return myPerson;
//        }
//    }
}
