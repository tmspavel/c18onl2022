package by.tms.test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.print("3333", 55);
        test.<Integer>print(3);
        test.print(new Integer[]{3, 34, 45});

        test.print("11", "1", "1");
    }
}
