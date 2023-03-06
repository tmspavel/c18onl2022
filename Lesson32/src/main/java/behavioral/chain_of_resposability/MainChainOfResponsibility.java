package by.home.behavioral.chain_of_resposability;

import static by.home.behavioral.chain_of_resposability.Priority.ASAP;
import static by.home.behavioral.chain_of_resposability.Priority.IMPORTANT;
import static by.home.behavioral.chain_of_resposability.Priority.ROUTINE;

public class MainChainOfResponsibility {

    public static void main(String[] args) {
        by.home.behavioral.chain_of_resposability.Notifier reportNotifier = new by.home.behavioral.chain_of_resposability.SimpleReportNotifier(ROUTINE);
        by.home.behavioral.chain_of_resposability.Notifier emailNotifier = new by.home.behavioral.chain_of_resposability.EmailNotifier(IMPORTANT);
        by.home.behavioral.chain_of_resposability.Notifier smsNotifier = new by.home.behavioral.chain_of_resposability.SMSNotifier(ASAP);
        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);
        reportNotifier.notifyManager("Everything is OK", ROUTINE);
        reportNotifier.notifyManager("Something went wrong!", IMPORTANT);
        reportNotifier.notifyManager("Houston, we've had a problem!!!", ASAP);

    }
}
