package p4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {//implements Comparable<Person> {
    private Long id;
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

//    @Override
//    public int compareTo(Person o2) {
//        return Integer.compare(this.getAge(), o2.getAge());
//    }

//            public int compare(Person o1, Person o2) {
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }

}
