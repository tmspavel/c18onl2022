package p1;

public class Practice6 {
    //Ссылки на метод как параметры методов
    /*
    Начиная с JDK 8 в Java можно в качестве параметра в метод передавать ссылку на другой метод.
    В принципе данный способ аналогичен передаче в метод лямбда-выражения.
    Ссылка на метод передается в виде имя_класса::имя_статического_метода (если метод статический)
    или объект_класса::имя_метода (если метод нестатический).
     */
    public static void main(String[] args) {
        Calc calc = new Calc();
        test(calc);
        System.out.println(calc.value);//12

        Practice2.Printable tPublisher = s -> System.out.println(s);

        Practice2.Printable printer = System.out::println;
        printer.print("Hello Java!");

        int[] nums = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//        ExpressionHelper exprHelper = new ExpressionHelper();
        System.out.println(sum(nums, Practice6::isEven));

        Expression expr = ExpressionHelper::isPositive;
        System.out.println(sum(nums, expr));
    }

    private static void test(Calc calc) {
        calc.value = 12;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i)) {
                result += i;
            }
        }
        return result;
    }

    interface Expression {
        boolean isEqual(int n);
    }


}

