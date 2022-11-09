public class HomeWork {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.
        int result = sum(100, 200);
        System.out.println(result);

        int sum = sum(Integer.MAX_VALUE, Integer.MAX_VALUE);
        System.out.println(sum);

        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(average(new int[]{-4, -2, -3, -1, -5}));
        System.out.println(average(new int[]{}));
        System.out.println(average(null));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3, 4));
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        if ((long) a + b > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
//        return (a >= b) ? a : b;
        if (a >= b) {
            return a;
        } else {
            return b;
        }
//        return Math.max(a, b);
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        double result = 0;
        if (array != null) {
            for (int value : array) {
                result += value;
            }
            return result / array.length;
        }
        return result;
    }

    /**
     * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        if (array != null && array.length > 0) {
//            int result = Integer.MIN_VALUE;
            int result = array[0];
            for (int i = 1; i < array.length; i++) {
                int value = array[i];
                if (value > result) {
                    result = value;
                }
            }
//            for (int value : array) {
//                if (value > result) {
//                    result = value;
//                }
//            }
            return result;
        }
        return 0;
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        return Math.hypot(a, b);
    }
}
