package com.home.util;

import java.util.Scanner;

public class InputUtils {
    public static Scanner scanner = new Scanner(System.in);

    public static int readIntFromConsole(String message, int bound) {
        int number;
        do {
            System.out.println(message + ":");
            while (!scanner.hasNextDouble()) {
                System.out.println("Введенное не является числом.");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (isNotInBounds(number, bound));
        return number;
    }

    public static String readStringFromConsole(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private static boolean isNotInBounds(int number, int bound) {
        if (number < 1 || number > bound) {
            System.out.println("Введенное не является положительным числом.");
        }
        return number < 1 || number > bound;
    }

    public static void waitEnterKeyPressed() {
        System.out.println("*** Нажмите клавишу ENTER для продолжения ***");
        scanner.nextLine();
    }

}
