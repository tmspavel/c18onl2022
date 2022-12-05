package p8;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book extends BookTest {
    private String name;
    private String author;
    private int year;
    private Person person;

    public Book(int test, String name, String author, int year) {
        super(test);
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();
        clone.setPerson(person.clone());
        return clone;
    }
}
