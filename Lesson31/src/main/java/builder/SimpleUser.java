package builder;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class SimpleUser {

    private int id;
    private String name;
    private String surname;
    private String email;

    public SimpleUser id(int id) {
        this.id = id;
        return this;
    }

    public SimpleUser name(String name) {
        this.name = name;
        return this;
    }

    public SimpleUser surname(String surname) {
        this.surname = surname;
        return this;
    }

    public SimpleUser email(String email) {
        this.email = email;
        return this;
    }

}
