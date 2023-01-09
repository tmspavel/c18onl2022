package by.tms.practice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@ToString
@Getter
@Setter
public class Box {
    private Car car;
    private List<String> names;

    public Box(Car car) {
        this.car = car;
    }
}
