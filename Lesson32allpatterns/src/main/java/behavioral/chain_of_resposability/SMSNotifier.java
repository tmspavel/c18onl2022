package behavioral.chain_of_resposability;

public class SMSNotifier extends behavioral.chain_of_resposability.Notifier {

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
