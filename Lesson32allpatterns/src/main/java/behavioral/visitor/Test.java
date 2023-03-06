package by.home.behavioral.visitor;

public class Test implements by.home.behavioral.visitor.ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
