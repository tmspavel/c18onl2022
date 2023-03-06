package creational.abstractfactory;

public class ProjectManagerBank implements creational.abstractfactory.ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("PM manages project");
    }
}
