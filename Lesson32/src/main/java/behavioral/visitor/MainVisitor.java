package by.home.behavioral.visitor;

public class MainVisitor {

    public static void main(String[] args) {
        Project project = new Project();
        by.home.behavioral.visitor.JuniorDeveloper juniorDeveloper = new by.home.behavioral.visitor.JuniorDeveloper();
        by.home.behavioral.visitor.SeniorDeveloper seniorDeveloper = new by.home.behavioral.visitor.SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beWritten(juniorDeveloper);
        System.out.println("-------------------");
        System.out.println("Senior in action...");
        project.beWritten(seniorDeveloper);
    }
}
