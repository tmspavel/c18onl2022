package behavioral.visitor2;

public class Dog implements Animal {

    @Override
    public void say(behavioral.visitor2.Visitor visitor) {
        visitor.sayDog();
    }
}
