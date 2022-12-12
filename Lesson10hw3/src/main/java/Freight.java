import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@ToString(callSuper = true)
public class Freight extends LandTransport {//грузовой
    private double carryingCapacity;//Грузоподъёмность(т)

    public void checkWeightCapacity(double weight) {
        if (weight <= carryingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}