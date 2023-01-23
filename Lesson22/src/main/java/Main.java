import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.stream()
              .collect(Collectors.joining(", ")).describeConstable();

        new Random().ints(5, 0, 11).toArray();
    }
}
