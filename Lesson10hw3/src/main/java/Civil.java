import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class Civil extends AirTransport {//гражданский
    private int countPassengers;//Кол-во пассажиров
    private boolean businessClass;//Наличие бизнес класса (true/false)

    public void checkPassengerCapacity(int people) {
        if (people <= countPassengers) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}