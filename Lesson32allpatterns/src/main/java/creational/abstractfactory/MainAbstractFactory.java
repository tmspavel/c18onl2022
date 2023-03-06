package creational.abstractfactory;

public class MainAbstractFactory {

    public static void main(String[] args) {
        creational.abstractfactory.ProjectTeamFactory projectTeamFactory = new creational.abstractfactory.ProjectTeamBank();
        Developer developer = projectTeamFactory.getDeveloper();
        creational.abstractfactory.Tester tester = projectTeamFactory.getTester();
        creational.abstractfactory.ProjectManager projectManager = projectTeamFactory.getProjectManager();
        developer.writeCode();
        tester.testProject();
        projectManager.manageProject();
    }
}
