package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Engine {
    private String name;
    private boolean started;

    public Engine(String name) {
        this.name = name;
    }

    public boolean isStarted() {
        return false;
    }
}
