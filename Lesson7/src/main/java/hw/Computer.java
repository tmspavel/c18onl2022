package hw;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private int countCycle;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private boolean burned;

    public Computer(int countCycle) {
        this.countCycle = countCycle;
    }

    public void on() {
        if (!burned) {
            int value = random.nextInt(2);
            if (countCycle > 0 && value == getEnteredValueFromConsole()) {
                System.out.println("включение!!");
                off();//переписать
            } else {
                System.out.println("комп сгорел!!");
                burned = true;
            }
        } else {
            System.out.println("комп сгорел!!");
            burned = true;
        }
    }

    private int getEnteredValueFromConsole() {
        int count = 0;
        do {
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
            } else {
                System.out.println("ошибка");
                scanner.next();
            }
        } while (count < 0);
        return count;
    }

    private void off() {
        System.out.println("выключение!");
        countCycle--;
    }
}
