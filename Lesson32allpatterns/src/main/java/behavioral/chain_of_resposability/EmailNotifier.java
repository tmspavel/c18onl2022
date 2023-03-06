package behavioral.chain_of_resposability;

public class EmailNotifier extends behavioral.chain_of_resposability.Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
