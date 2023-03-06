package by.home.behavioral.mediator;

public class MainMediator {

    public static void main(String[] args) {
        by.home.behavioral.mediator.SimpleTextChat chat = new by.home.behavioral.mediator.SimpleTextChat();
        by.home.behavioral.mediator.User admin = new by.home.behavioral.mediator.Admin(chat, "Admin");
        by.home.behavioral.mediator.User user1 = new by.home.behavioral.mediator.SimpleUser(chat, "User 1");
        by.home.behavioral.mediator.User user2 = new by.home.behavioral.mediator.SimpleUser(chat, "User 2");
        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        user1.sendMessage("Hello, I am User 1!!!");
        admin.sendMessage("I am Admin!!!");
    }
}
