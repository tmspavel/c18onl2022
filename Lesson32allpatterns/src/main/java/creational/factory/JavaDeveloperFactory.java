package creational.factory;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createNewDeveloper() {
        return new JavaDeveloper();
    }
}
