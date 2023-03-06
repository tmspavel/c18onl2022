package by.home.behavioral.visitor2;

public class Dog implements Animal {

    @Override
    public void say(by.home.behavioral.visitor2.Visitor visitor) {
        visitor.sayDog();
    }
}
