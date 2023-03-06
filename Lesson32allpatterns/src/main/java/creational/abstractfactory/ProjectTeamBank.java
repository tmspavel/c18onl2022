package creational.abstractfactory;

public class ProjectTeamBank implements creational.abstractfactory.ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public creational.abstractfactory.Tester getTester() {
        return new creational.abstractfactory.AutomationQA();
    }

    @Override
    public creational.abstractfactory.ProjectManager getProjectManager() {
        return new creational.abstractfactory.ProjectManagerBank();
    }
}
