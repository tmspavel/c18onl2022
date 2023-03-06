package by.home.creational.abstractfactory;

public class MainAbstractFactory {

    public static void main(String[] args) {
        by.home.creational.abstractfactory.ProjectTeamFactory projectTeamFactory = new by.home.creational.abstractfactory.ProjectTeamBank();
        Developer developer = projectTeamFactory.getDeveloper();
        by.home.creational.abstractfactory.Tester tester = projectTeamFactory.getTester();
        by.home.creational.abstractfactory.ProjectManager projectManager = projectTeamFactory.getProjectManager();
        developer.writeCode();
        tester.testProject();
        projectManager.manageProject();
    }
}
