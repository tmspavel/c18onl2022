package by.home.behavioral.visitor2;

public class MainVisitor2 {

    public static void main(String[] args) {
        Animal dog = new by.home.behavioral.visitor2.Dog();
        Animal cat = new by.home.behavioral.visitor2.Cat();
        dog.say(new by.home.behavioral.visitor2.ConcreteVisitor());
        cat.say(new by.home.behavioral.visitor2.ConcreteVisitor());
    }
}
