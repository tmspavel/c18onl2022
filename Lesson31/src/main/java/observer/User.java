package observer;

public class User implements ChatObserver {

    @Override
    public void update(String message) {
        System.out.printf("%s get new message: %s\n", this.getClass().getSimpleName(), message);
    }
}
