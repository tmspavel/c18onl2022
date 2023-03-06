package structural.composite;

public class MainComposite {

    public static void main(String[] args) {
        structural.composite.Team team = new structural.composite.Team();
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new PhpDeveloper());
        team.addDeveloper(new JavaDeveloper());
        team.writeCode();
    }
}
