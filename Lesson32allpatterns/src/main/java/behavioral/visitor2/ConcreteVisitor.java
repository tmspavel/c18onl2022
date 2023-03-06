package by.home.behavioral.visitor2;

public class ConcreteVisitor implements by.home.behavioral.visitor2.Visitor {

    @Override
    public void sayDog() {
        System.out.println("Say another gaw");
    }

    @Override
    public void sayCat() {
        System.out.println("Say another meow");
    }
}
