package p1;

import p3.Person;

import java.util.function.BiPredicate;

public class Practice1 {
    static boolean test(Person a, Integer b) {
        return a.getAge() > b;
    }

    public static void main(String[] args) {
        //лямбда выражения
        /*
            Лямбда представляет набор инструкций,
            которые можно выделить в отдельную переменную и затем многократно вызвать
            в различных местах программы.
         */

        boolean test = test(new Person("sdf", 23, "sdf"), 12);
        System.out.println(test);

        BiPredicate<Person, Integer> filenameFilter = (a, b) -> {
            System.out.println(a);
            return a.getAge() > b;
        };

        BiPredicate<Person, Integer> filenameFilter1 = (a, b) -> a.getAge() > b;


        boolean test1 = filenameFilter.test(new Person("sdf", 23, "sdf"), 12);
        System.out.println(test1);


        /*
             Основу лямбда-выражения составляет лямбда-оператор, который представляет стрелку ->.
             Этот оператор разделяет лямбда-выражение на две части: левая часть содержит список параметров выражения,
             а правая собственно представляет тело лямбда-выражения, где выполняются все действия.
         */
        /*
         Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в функциональном интерфейсе. При этом важно, что функциональный интерфейс должен содержать
         только один единственный метод без реализации.
         */

        Operation operation1 = new Operation() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        operation1.calculate(12, 12);

        Operation m1 = (a, b) -> {
            int i = a + b;
            i++;
            return i;
        };
        int result = m1.calculate(2, 5);
        System.out.println(result);


        Operation2 operation2 = a -> a * a;
        System.out.println(operation2.calculate(4));

        Operation operation = (x, y) -> {
//            System.out.println(x);
//            System.out.println(y);
            return x + y;
        };

        int summa = operation.calculate(10, 20);
        System.out.println(summa);

//        test("sdd");
        /*
        Отложенное выполнение
        Одним из ключевых моментов в использовании лямбд является отложенное выполнение.
        То есть мы определяем в одном месте программы лямбда-выражение и затем можем его вызывать
        при необходимости неопределенное количество раз в различных частях программы.
        Отложенное выполнение может потребоваться, к примеру, в следующих случаях:
        Выполнение кода отдельном потоке
        Выполнение одного и того же кода несколько раз
        Выполнение кода в результате какого-то события
        Выполнение кода только в том случае, когда он действительно необходим и если он необходим
         */

        //Передача параметров в лямбда-выражение
        /*
        operation = (int x, int y)->x+y;
        ()-> 30 + 20;
        n-> n * n;
         */
    }

//    private static void test(Operation operation) {
//
//    }

//    private static void test(Operation operation) {
//        System.out.println(operation.calculate(10, 20));
//    }

    @FunctionalInterface
    interface Operation {
        int calculate(int a, int b);
    }

    @FunctionalInterface
    interface Operation2 {
        int calculate(int a);
    }
}
