package creational.builder2;

public class SportCarBuilder implements creational.builder2.CarBuilder {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public SportCarBuilder() {
        super();
    }

    @Override
    public creational.builder2.CarBuilder fixChassis() {
        System.out.println("Assembling chassis of the sports model");
        this.chassis = "Sporty Chassis";
        return this;
    }

    @Override
    public creational.builder2.CarBuilder fixBody() {
        System.out.println("Assembling body of the sports model");
        this.body = "Sporty Body";
        return this;
    }

    @Override
    public creational.builder2.CarBuilder paint() {
        System.out.println("Painting body of the sports model");
        this.paint = "Sporty Torch Red Paint";
        return this;
    }

    @Override
    public creational.builder2.CarBuilder fixInterior() {
        System.out.println("Setting up interior of the sports model");
        this.interior = "Sporty interior";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.doQualityCheck()) {
            return car;
        } else {
            System.out.println("Car assembly is incomplete. Can't deliver!");
        }
        return null;
    }
}
