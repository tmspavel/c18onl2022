package singleton.otherExamples.billPughAndReflection;

public class BillPughSingleton {

    private BillPughSingleton() {
        int count = 0;
        count++;
        System.out.println(count);
    }

    private static class SingleTonHelper {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingleTonHelper.INSTANCE;
    }
}
