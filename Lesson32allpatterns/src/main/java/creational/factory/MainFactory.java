package creational.factory;

import static creational.factory.DeveloperType.Cpp;
import static creational.factory.DeveloperType.JAVA;
import static creational.factory.DeveloperType.PHP;

public class MainFactory {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = getDeveloper(JAVA);
        Developer developer = developerFactory.createNewDeveloper();
        developer.writeCode();

        DeveloperFactory developerFactory1 = getDeveloper(Cpp);
        Developer developer1 = developerFactory1.createNewDeveloper();
        developer1.writeCode();

        DeveloperFactory developerFactory2 = getDeveloper(PHP);
        Developer developer2 = developerFactory2.createNewDeveloper();
        developer2.writeCode();
    }

    static DeveloperFactory getDeveloper(creational.factory.DeveloperType value) {
        return switch (value) {
            case JAVA -> new creational.factory.JavaDeveloperFactory();
            case Cpp -> new creational.factory.CppDeveloperFactory();
            case PHP -> new creational.factory.PhpDeveloperFactory();
        };
    }
}
