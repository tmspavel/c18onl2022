package by.home.behavioral.template2;

public class MyTemplate2Main {

    public static void main(String[] args) {
        by.home.behavioral.template2.Tea tea = new by.home.behavioral.template2.Tea();
        by.home.behavioral.template2.Coffee coffee = new by.home.behavioral.template2.Coffee();
        tea.makeBeverage();
        System.out.println("-----------------------");
        coffee.makeBeverage();
    }
}
