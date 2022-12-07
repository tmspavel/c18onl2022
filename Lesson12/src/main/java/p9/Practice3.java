package p9;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Practice3 {
    public static void main(String[] args) {
        try {
            method();
        } catch (ArithmeticException | NoSuchElementException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }

    private static void method() {
        if (4 > 5) {
            throw new InputMismatchException();
        } else {
            throw new ArithmeticException();
        }
    }
}
