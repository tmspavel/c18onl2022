package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите набор чисел:");
        String inputLine = new Scanner(System.in).nextLine();
        InputOutput inputOutput = new InputOutput();
        inputOutput.inputStringToNumbers(inputLine).printNumbers();
    }
}
