package behavioral.chain_of_resposability;

public class SimpleReportNotifier extends behavioral.chain_of_resposability.Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier is using simple report: " + message);
    }
}
