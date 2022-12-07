package p2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Book {

    private String name;
    //    private int value;
    private Author author;

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    protected Book clone() {
        Book book = new Book();
        book.setName(name);
//        book.setValue(value);
        book.setAuthor(new Author(author.getName(), author.getAge()));
        return book;
    }
}
