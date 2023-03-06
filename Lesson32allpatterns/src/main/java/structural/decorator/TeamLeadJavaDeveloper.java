package by.home.structural.decorator;

public class TeamLeadJavaDeveloper extends by.home.structural.decorator.DeveloperDecorator {

    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public void sendCodeToCustomer() {
        System.out.println("Send code.");
    }

    @Override
    public void writeCode() {
        super.writeCode();
        sendCodeToCustomer();
    }
}
