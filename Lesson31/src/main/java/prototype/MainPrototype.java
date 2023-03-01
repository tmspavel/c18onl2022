package prototype;

public class MainPrototype {

    public static void main(String[] args) {
        Lion lion1 = new Lion("Lion", 7, "Africa");
        Lion lion2 = (Lion) lion1.copy();
        System.out.println(lion1.toString());
        System.out.println(lion2.toString());
    }
}
