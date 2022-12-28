package p1;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ExpressionHelper {
    // класс, в котором определены методы
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }
}
