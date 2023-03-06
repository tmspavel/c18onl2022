package creational.factory;

public class PhpDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createNewDeveloper() {
        return new PhpDeveloper();
    }
}
