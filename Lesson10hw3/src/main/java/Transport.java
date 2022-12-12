import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public abstract class Transport implements Transportable {//базовый класс
    private double power; // Мощность(в лошадиных силах)
    private double maxSpeed; //Максимальная скорость(км/ч)
    private double weight; //Масса (кг)
    private String brand; //марка

    public Transport() {
    }

    private double getPower() {
        return power * 0.74;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + getPower() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }


    @Override
    public String info() {
        return power + " " + maxSpeed;
    }
}