package behavioral.mediator;

public class MainMediator {

    public static void main(String[] args) {
        behavioral.mediator.SimpleTextChat chat = new behavioral.mediator.SimpleTextChat();
        behavioral.mediator.User admin = new behavioral.mediator.Admin(chat, "Admin");
        behavioral.mediator.User user1 = new behavioral.mediator.SimpleUser(chat, "User 1");
        behavioral.mediator.User user2 = new behavioral.mediator.SimpleUser(chat, "User 2");
        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        user1.sendMessage("Hello, I am User 1!!!");
        admin.sendMessage("I am Admin!!!");
    }
}
