package by.home.creational.abstractfactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    by.home.creational.abstractfactory.Tester getTester();

    by.home.creational.abstractfactory.ProjectManager getProjectManager();
}
