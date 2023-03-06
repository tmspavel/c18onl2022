package by.home.behavioral.visitor;

public class Project implements by.home.behavioral.visitor.ProjectElement {

    private by.home.behavioral.visitor.ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new by.home.behavioral.visitor.ProjectElement[]{
                new by.home.behavioral.visitor.ProjectClass(),
                new Database(),
                new by.home.behavioral.visitor.Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (by.home.behavioral.visitor.ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developer);
        }
    }
}
