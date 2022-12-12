import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Military extends AirTransport {//военный
    private boolean catapultSystem;//Наличие системы катапультирования
    private int countRockets;//Кол-во ракет на борту

    public String info() {
        return super.info() + catapultSystem + " " + countRockets;
    }

    public void shoot() {
        if (countRockets > 0) {
            System.out.println("Ракета пошла...");
            countRockets--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult() {
        if (catapultSystem) {
            System.out.println("Катапультирование прошло успешно");
            catapultSystem = false;
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}