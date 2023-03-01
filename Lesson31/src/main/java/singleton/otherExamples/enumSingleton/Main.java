package singleton.otherExamples.enumSingleton;

public class Main {

    public static void main(String[] args) {

        EnumSingleton singletonOne = EnumSingleton.INSTANCE;
        EnumSingleton singletonTwo = EnumSingleton.INSTANCE;

        System.out.println(singletonOne.hashCode());
        System.out.println(singletonTwo.hashCode());
    }
}
