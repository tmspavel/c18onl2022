package by.home.creational.factory;

public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createNewDeveloper() {
        return new by.home.creational.factory.CppDeveloper();
    }
}
