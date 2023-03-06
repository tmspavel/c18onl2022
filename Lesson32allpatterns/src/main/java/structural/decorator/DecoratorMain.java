package by.home.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Developer developer = new by.home.structural.decorator.TeamLeadJavaDeveloper(new by.home.structural.decorator.SeniorJavaDeveloper(new JavaDeveloper()));
        developer.writeCode();
    }
}
