package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements behavioral.mediator.Chat {

    private behavioral.mediator.User admin;
    private List<behavioral.mediator.User> users = new ArrayList<>();

    public void addUserToChat(behavioral.mediator.User user) {
        this.users.add(user);
    }

    public void setAdmin(behavioral.mediator.User admin) {
        this.admin = admin;
    }

    @Override
    public void sendMessage(String message, behavioral.mediator.User user) {
        for (behavioral.mediator.User u : users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
