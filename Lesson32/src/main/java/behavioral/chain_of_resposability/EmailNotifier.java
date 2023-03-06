package by.home.behavioral.chain_of_resposability;

public class EmailNotifier extends by.home.behavioral.chain_of_resposability.Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
