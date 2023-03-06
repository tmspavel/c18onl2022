package by.home.behavioral.observer;

public class MainObserver {

    public static void main(String[] args) {
        by.home.behavioral.observer.JavaDeveloperJobSite jobSite = new by.home.behavioral.observer.JavaDeveloperJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");
        Observer firstSubscriber = new Subscriber("Ivan Ivanov");
        Observer secondSubscriber = new Subscriber("Petr Petrov");
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("First Java Position");
    }
}
