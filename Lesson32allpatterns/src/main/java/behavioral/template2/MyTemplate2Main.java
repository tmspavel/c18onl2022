package behavioral.template2;

public class MyTemplate2Main {

    public static void main(String[] args) {
        behavioral.template2.Tea tea = new behavioral.template2.Tea();
        behavioral.template2.Coffee coffee = new behavioral.template2.Coffee();
        tea.makeBeverage();
        System.out.println("-----------------------");
        coffee.makeBeverage();
    }
}
