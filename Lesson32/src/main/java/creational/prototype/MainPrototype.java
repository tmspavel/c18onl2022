package by.home.creational.prototype;

public class MainPrototype {

    public static void main(String[] args) {
        by.home.creational.prototype.Lion lion1 = new by.home.creational.prototype.Lion("Lion", 7, "Africa");
        by.home.creational.prototype.Lion lion2 = (by.home.creational.prototype.Lion) lion1.copy();
        System.out.println(lion1.toString());
        System.out.println(lion2.toString());
    }
}
