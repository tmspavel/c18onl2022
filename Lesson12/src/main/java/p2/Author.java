package p2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Author implements Cloneable {
    private String name;
    private int age;

    @Override
    protected Author clone() throws CloneNotSupportedException {
        return (Author) super.clone();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Author author = (Author) o;
//        return age == author.age && Objects.equals(name, author.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
