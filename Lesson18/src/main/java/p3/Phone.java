package p3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Phone {
    private String name;
    //    private String company;
    private int price;
    private List<Person> persons;
}
