import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();//строки
        int j = scanner.nextInt();//столбцы

        int[][] ints = new int[i][j];

        System.out.println(ints.length);

        int[] mass = new int[10];
        System.out.println(mass.length);

        for (int k = 0; k < ints.length; k++) {
            System.out.println(Arrays.toString(ints[k]));
        }
    }
}
