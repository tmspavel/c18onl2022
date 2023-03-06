package structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Developer developer = new structural.decorator.TeamLeadJavaDeveloper(new structural.decorator.SeniorJavaDeveloper(new JavaDeveloper()));
        developer.writeCode();
    }
}
