package p0;

import lombok.Setter;
import lombok.ToString;

//@Builder
@Setter
@ToString
public class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    private void test() {
        System.out.println("");
    }
}
