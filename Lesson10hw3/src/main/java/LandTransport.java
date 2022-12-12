import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public abstract class LandTransport extends Transport {//наземный
    private int wheels; //Количество колёс
    private double fuelConsumption;//Расход топлива(л/100км)

    public LandTransport() {
        super();
    }
}