package behavioral.visitor;

public class Test implements behavioral.visitor.ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
