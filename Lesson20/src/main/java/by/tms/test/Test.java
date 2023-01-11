package by.tms.test;

import java.util.Arrays;
import java.util.Objects;

public class Test {
    private String test;

    void print(String value, Integer intValue) {
        System.out.println(value + intValue);
    }

    void print(String... value) {
        System.out.println(Arrays.toString(value));
    }

    <T> void print(T value) {
        System.out.println("T " + value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test1 = (Test) o;
        return Objects.equals(test, test1.test);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test);
    }
}
