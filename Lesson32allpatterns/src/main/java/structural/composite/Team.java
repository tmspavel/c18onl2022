package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {

    private final List<Developer> developers = new ArrayList<>();

    void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("Developers develop code...");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
