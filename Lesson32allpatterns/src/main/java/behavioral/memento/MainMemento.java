package behavioral.memento;

public class MainMemento {

    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        behavioral.memento.GitHubRepo gitHubRepo = new behavioral.memento.GitHubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);
        System.out.println("Saving current version to GitHub");
        gitHubRepo.setSave(project.save());
        System.out.println("Updating project to Version 1.1");
        System.out.println("Writing poor code ...");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);
        System.out.println("Something went wrong...");
        project.load(gitHubRepo.getSave());
        System.out.println("Project after rollback");
        System.out.println(project);
    }
}
