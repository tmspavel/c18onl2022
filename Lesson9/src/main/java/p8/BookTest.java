package p8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BookTest implements Cloneable {
    private int test;

    public BookTest(int test) {
        this.test = test;
    }
}
