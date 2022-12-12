import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Light extends LandTransport {//легковой
    private String bodyType; //Тип кузова
    private int countPassengers;//Кол-во пассажиров

    public Light() {
        super();
    }

    public void info(double time) {
//        brand = "Москвич";
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч проедет "
                + getWay(time) + " км и израсходует " + calculateConsumedFuel(time) + " литров топлива.");
    }

    private double calculateConsumedFuel(double time) {
        return getWay(time) * getFuelConsumption() / 100;
    }

    private double getWay(double time) {
        return getMaxSpeed() * time;
    }
}