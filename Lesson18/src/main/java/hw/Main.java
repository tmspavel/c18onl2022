package hw;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    private static final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        try {
            System.out.println("Введите цифру 1 или 2");
            Object result = getResult();
            System.out.println("Результат: " + result);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception exception) {
            System.out.println("Не корректные данные");
        }
    }

    private static Object getResult() {
        CallBack printlnMessage = System.out::println;
        Service service = new Service();
        int enteredValue = scanner.nextInt();
        switch (enteredValue) {
            case 1 -> {
                Supplier<String> supplier = scanner::next;
                return service.getValue(enteredValue, Data.of(supplier, printlnMessage), "введите строку");
            }
            case 2 -> {
                Supplier<Integer> supplier = scanner::nextInt;
                return service.getValue(enteredValue, Data.of(supplier, printlnMessage), "введите число");
            }
            default -> throw new IllegalArgumentException("Вы ввели не правильную цифру");
        }
    }
}

interface CallBack {
    void execute(String message);
}

record Data(Supplier<?> supplier, CallBack callBack) {
    public static Data of(Supplier<?> supplier, CallBack callBack) {
        return new Data(supplier, callBack);
    }
}
