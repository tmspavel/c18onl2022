package factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {

    protected String name;
    protected List<String> accessories = new ArrayList<>();

    @Override
    public String toString() {
        return "Car model: " + name + "\n" + "Equipment: " + accessories;
    }
}
