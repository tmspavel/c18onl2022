package behavioral.visitor;

public class Database implements behavioral.visitor.ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
