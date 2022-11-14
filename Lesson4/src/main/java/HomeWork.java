import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        printLetters();

        //2
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                System.out.println("четное");
            } else {
                System.out.println("не четное");
            }
        } else {
            System.out.println("ошибка!!");
        }
        //3

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double absA = Math.abs(a);
        double absB = Math.abs(b);
        double absC = Math.abs(c);
        System.out.println(Math.min(Math.min(absA, absB), absC));
        //4

        ////        [0;28800]
        Random random = new Random();
        int value = random.nextInt(28801);
        display(value);

        //5
        System.out.println("    byte short char int long float double boolean");
        System.out.println("byte  т    ня    я   ня   ня   ня    ня      х");
        System.out.println("short я    т     я   ня   ня   ня    ня      х");
        System.out.println("char  я    я     т   ня   ня   ня    ня      х");
        System.out.println("int   я    я     я   т    ня   ня    ня      х");
        System.out.println("long  я    я     я   я    т    ня    ня      х");
        System.out.println("float я    я     я   я    я    т     ня      х");
        System.out.println("double я   я     я   я    я    я     т       х");
        System.out.println("boolean х  х     х   х    х    х     х       т");
    }

    private static void display(int value) {
        int hour = value / 60 / 60;//0
        String result = switch (hour) {
            case 0 -> "менее часа";
            case 1 -> "час";
            case 2, 3, 4 -> "часа";
            case 5, 6, 7, 8 -> "часов";
            default -> "";
        };
        String temp = hour == 0 ? "" : "" + hour;
        if (hour == 0) {
            temp = "";
        } else {
            temp = "" + hour;
        }
        System.out.println("осталось " + temp + " " + result);
        //hour = 0 - осталось мене часа
    }

    private static void printLetters() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
    }

//Задачи:
//1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

//2)Проверка четности числа
//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.

//3) Меньшее по модулю число
//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
// пользователем вещественных чисел с консоли.

//4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
// оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
// когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
// (т.е. рабочий день закончился).
//Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
// Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
// сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
// далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
// выводиться фраза о количестве полных часов, содержащихся в n секундах.

//5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn
}

