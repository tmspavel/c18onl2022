package by.tms.model;

public class Person {
    //характеристики(глобальные переменные) поля
    public int age;//0
    public boolean flag;//false
    public String name;//null
    public Address address;//null

//    public Person(int myAge, String myName) {
//        age = myAge;//32 = 32
//        name = myName;//
//    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person(Address address) {
        this.address = address;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person() {// конструктор по умолчанию
        System.out.println("Person");
    }

    public Person(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    //    public void main(String[] args) {
//        int age = 0;
//    }
//
    public void test(int value) {
        System.out.println(++value);
        age = 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", flag=" + flag +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
