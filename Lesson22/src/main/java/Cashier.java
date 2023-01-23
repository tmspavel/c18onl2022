import static java.util.Objects.nonNull;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cashier {

    private String name;
    private List<String> users;

    public List<String> getUsers() {
        return nonNull(users) ? users : new ArrayList<>();
    }
}
