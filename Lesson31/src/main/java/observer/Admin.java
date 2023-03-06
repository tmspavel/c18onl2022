package observer;

public class Admin implements ChatObserver {

    @Override
    public void update(String message) {
        System.out.printf("%s get new message: %s\n", this.getClass().getSimpleName(), message);
    }
}
