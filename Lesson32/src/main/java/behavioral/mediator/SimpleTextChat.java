package by.home.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements by.home.behavioral.mediator.Chat {

    private by.home.behavioral.mediator.User admin;
    private List<by.home.behavioral.mediator.User> users = new ArrayList<>();

    public void addUserToChat(by.home.behavioral.mediator.User user) {
        this.users.add(user);
    }

    public void setAdmin(by.home.behavioral.mediator.User admin) {
        this.admin = admin;
    }

    @Override
    public void sendMessage(String message, by.home.behavioral.mediator.User user) {
        for (by.home.behavioral.mediator.User u : users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
