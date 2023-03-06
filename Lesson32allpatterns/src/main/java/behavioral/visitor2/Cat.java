package behavioral.visitor2;

public class Cat implements Animal {

    @Override
    public void say(behavioral.visitor2.Visitor visitor) {
        visitor.sayCat();
    }
}
