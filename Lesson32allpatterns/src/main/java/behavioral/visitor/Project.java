package behavioral.visitor;

public class Project implements behavioral.visitor.ProjectElement {

    private behavioral.visitor.ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new behavioral.visitor.ProjectElement[]{
                new behavioral.visitor.ProjectClass(),
                new Database(),
                new behavioral.visitor.Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (behavioral.visitor.ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developer);
        }
    }
}
