package p1;

public class Practice5 {
    //Лямбды как параметры методов
    public static void main(String[] args) {
        {
            Expression func = (n) -> n % 2 == 0;

            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(sum(nums, func)); // 20
        }
        {
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int x = sum(nums, number -> number > 5); // сумма чисел, которые больше 5
            System.out.println(x);  // 30
        }
    }

    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int value : numbers) {
//            if (value % 2 == 0) {
//                result += value;
//            }
            if (func.isEqual(value)) {//само условие определяется в лямбда выражении
                result += value;
            }
        }
        return result;
    }

    @FunctionalInterface
    interface Expression {
        boolean isEqual(int n);
    }
}

