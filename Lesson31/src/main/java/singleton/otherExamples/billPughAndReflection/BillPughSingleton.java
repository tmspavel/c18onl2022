package by.teachmeskills.patterns.singleton.otherExamples.billPughAndReflection;

public class BillPughSingleton {
    private static BillPughSingleton INSTANCE;

    private BillPughSingleton() {
        if (INSTANCE != null) {
            throw new UnsupportedOperationException("cannot instance this class");
        }
    }

    public static BillPughSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BillPughSingleton();
        }
        return INSTANCE;
    }
}
