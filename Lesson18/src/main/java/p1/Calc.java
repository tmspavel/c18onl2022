package p1;

public class Calc implements Practice1.Operation {
    int value;

    @Override
    public int calculate(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        return a + b;
    }
}
