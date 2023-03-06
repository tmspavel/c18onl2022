package behavioral.visitor;

public class MainVisitor {

    public static void main(String[] args) {
        Project project = new Project();
        behavioral.visitor.JuniorDeveloper juniorDeveloper = new behavioral.visitor.JuniorDeveloper();
        behavioral.visitor.SeniorDeveloper seniorDeveloper = new behavioral.visitor.SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beWritten(juniorDeveloper);
        System.out.println("-------------------");
        System.out.println("Senior in action...");
        project.beWritten(seniorDeveloper);
    }
}
