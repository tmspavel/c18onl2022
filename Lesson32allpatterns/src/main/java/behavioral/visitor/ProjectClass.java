package behavioral.visitor;

public class ProjectClass implements behavioral.visitor.ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
