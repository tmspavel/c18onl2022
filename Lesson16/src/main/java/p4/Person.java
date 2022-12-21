package p4;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "id")
public class Person {
    private Long id;
    private String name;
    private int age;
}
