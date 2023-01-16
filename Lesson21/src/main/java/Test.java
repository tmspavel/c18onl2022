import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));
        cars.stream()
                .filter(car -> StringUtils.isNotBlank(car.getAutoNumber()))//почему-то не работает isBlank?
                .filter(car -> car.getYear() > 2010)
                .map(Car::toString)
                .forEach(System.out::println);

        Random random = new Random();
        Set<Integer> number = random.ints(50, 1, 101)
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.toSet());

    }
}

@ToString
@Getter
@AllArgsConstructor
class Car {
    private String autoNumber;
    private int year;
}