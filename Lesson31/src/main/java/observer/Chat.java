package observer;

import java.util.ArrayList;
import java.util.List;

public class Chat {

    private List<String> messages;

    private List<ChatObserver> observers;

    public Chat() {
        this.messages = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addObserver(ChatObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ChatObserver observer) {
        observers.remove(observer);
    }

    public void addMessage(String message) {
        messages.add(message);
        System.out.printf("Chat get new message: %s\n", message);
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (ChatObserver observer : observers) {
            observer.update(message);
        }
    }
}
