package h2;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Book {
    private String author; //Автор
    private String name;    //Название
    private Integer issueYear; //Год издания
}