package by.home.creational.abstractfactory;

public class ProjectTeamBank implements by.home.creational.abstractfactory.ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public by.home.creational.abstractfactory.Tester getTester() {
        return new by.home.creational.abstractfactory.AutomationQA();
    }

    @Override
    public by.home.creational.abstractfactory.ProjectManager getProjectManager() {
        return new by.home.creational.abstractfactory.ProjectManagerBank();
    }
}
