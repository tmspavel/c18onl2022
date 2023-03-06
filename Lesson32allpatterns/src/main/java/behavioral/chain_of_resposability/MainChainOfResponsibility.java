package behavioral.chain_of_resposability;

import static behavioral.chain_of_resposability.Priority.ASAP;
import static behavioral.chain_of_resposability.Priority.IMPORTANT;
import static behavioral.chain_of_resposability.Priority.ROUTINE;

public class MainChainOfResponsibility {

    public static void main(String[] args) {
        behavioral.chain_of_resposability.Notifier reportNotifier = new behavioral.chain_of_resposability.SimpleReportNotifier(ROUTINE);
        behavioral.chain_of_resposability.Notifier emailNotifier = new behavioral.chain_of_resposability.EmailNotifier(IMPORTANT);
        behavioral.chain_of_resposability.Notifier smsNotifier = new behavioral.chain_of_resposability.SMSNotifier(ASAP);
        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);
        reportNotifier.notifyManager("Everything is OK", ROUTINE);
        reportNotifier.notifyManager("Something went wrong!", IMPORTANT);
        reportNotifier.notifyManager("Houston, we've had a problem!!!", ASAP);

    }
}
