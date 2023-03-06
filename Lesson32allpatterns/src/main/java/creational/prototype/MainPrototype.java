package creational.prototype;

public class MainPrototype {

    public static void main(String[] args) {
        creational.prototype.Lion lion1 = new creational.prototype.Lion("Lion", 7, "Africa");
        creational.prototype.Lion lion2 = (creational.prototype.Lion) lion1.copy();
        System.out.println(lion1.toString());
        System.out.println(lion2.toString());
    }
}
