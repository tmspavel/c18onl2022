package singleton.otherExamples.billPughAndReflection;

public class Main {
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        System.out.println(billPughSingleton1.hashCode());

        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        System.out.println(billPughSingleton2.hashCode());


    }
}
