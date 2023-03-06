package by.home.behavioral.visitor;

public class Database implements by.home.behavioral.visitor.ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
