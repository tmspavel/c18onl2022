package by.home.structural.decorator;

public class SeniorJavaDeveloper extends by.home.structural.decorator.DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public void makeReviewCode() {
        System.out.println("Review code.");
    }

    @Override
    public void writeCode() {
        super.writeCode();
        makeReviewCode();
    }
}
