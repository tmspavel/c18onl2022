package p1;

public class Practice3 {
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        main2();

        System.out.println(x);//10
        Operation op = () -> {
            x = 30;
            return x + y;
        };
        System.out.println(x);//10
        System.out.println(op.calculate()); // 50
        System.out.println(x); // 30 - значение x изменилось
    }

    public static void main2() {
        int n = 70;
        int m = 30;
        Operation op = () -> {
//            n = 100; //- так нельзя сделать
            return m + n + 30;
        };
//        n = 100; // - так тоже нельзя
        System.out.println(op.calculate()); // 130
//        n = 100;
    }

    @FunctionalInterface
    interface Operation {
        int calculate();
    }
}
