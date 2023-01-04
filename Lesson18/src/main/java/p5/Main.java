package p5;

public class Main {
    public static void main(String[] args) {
        Expression func = (n, v, b) -> {
            int i = n + v + b;
        };
        func.isEqual(1, 2, 3);
    }

    @FunctionalInterface
    interface Expression {
        void isEqual(int n, int f, int h);
    }
}
