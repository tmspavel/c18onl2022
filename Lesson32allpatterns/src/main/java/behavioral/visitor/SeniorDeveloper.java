package behavioral.visitor;

public class SeniorDeveloper implements Developer {

    @Override
    public void create(behavioral.visitor.ProjectClass projectClass) {
        System.out.println("Rewriting class after junior");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(behavioral.visitor.Test test) {
        System.out.println("Creating reliable test...");
    }
}
