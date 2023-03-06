package creational.abstractfactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    creational.abstractfactory.Tester getTester();

    creational.abstractfactory.ProjectManager getProjectManager();
}
