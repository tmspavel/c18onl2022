package p2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("123\\2345");
        System.out.println(Arrays.toString("123\\2345".split("\\\\")));
    }
}
