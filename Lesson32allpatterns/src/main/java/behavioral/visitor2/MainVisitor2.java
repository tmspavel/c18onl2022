package behavioral.visitor2;

public class MainVisitor2 {

    public static void main(String[] args) {
        Animal dog = new behavioral.visitor2.Dog();
        Animal cat = new behavioral.visitor2.Cat();
        dog.say(new behavioral.visitor2.ConcreteVisitor());
        cat.say(new behavioral.visitor2.ConcreteVisitor());
    }
}
