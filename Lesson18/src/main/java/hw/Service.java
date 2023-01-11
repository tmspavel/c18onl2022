package hw;

import java.util.Scanner;

public class Service {
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Object getValue() {
        switch (scanner.nextInt()) {
            case 1 -> {
                IValue<String> result = this::reverse;
                return result.getValue(scanner.next());
            }
            case 2 -> {
                IValue<Integer> result = this::factorial;
                return result.getValue(scanner.nextInt());
            }
            default -> throw new IllegalArgumentException("Вы ввели не правильную цифру");
        }
    }

    private String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
