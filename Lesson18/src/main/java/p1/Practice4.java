package p1;

public class Practice4 {
    /*
    Обобщенный функциональный интерфейс
     */
    public static void main(String[] args) {

        Operation<Integer> operation1 = (x, y) -> x + y;
        Operation<Object> operation2 = (x, y) -> x.toString() + y;

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate("20", "10")); //2010
    }

    @FunctionalInterface
    interface Operation<T> {
        T calculate(T x, T y);
    }
}

