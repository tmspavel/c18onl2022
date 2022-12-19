package com.tms.io.model;

import java.io.Serializable;

public class Person implements Serializable {
    public static final String MALE = "male";
    public static final String FEMALE = "female";

    private Address address;
    private int age;
    private String name;
    private transient String surname;
    //enum is definitely the better option here
    private String sex = FEMALE;
    private transient int addressReqeustCount = 0;

    public Person() {
    }

    public Person(Address address, int age, String name, String surname, String sex) {
        this.address = address;
        this.age = age;
        this.name = beautifyNameSurname(name);
        this.surname = beautifyNameSurname(surname);
        if (MALE.equals(sex) || FEMALE.equals(sex)) {
            this.sex = sex;
        }
    }

    public Address getAddress() {
        addressReqeustCount++;
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.address = address.clone();
        return clone;
    }

    private String beautifyNameSurname(String name) {
        name = name.trim().toLowerCase();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }


    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

