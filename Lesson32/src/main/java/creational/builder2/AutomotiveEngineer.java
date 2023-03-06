package by.home.creational.builder2;

public class AutomotiveEngineer {

    private by.home.creational.builder2.CarBuilder builder;

    public AutomotiveEngineer(by.home.creational.builder2.CarBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
        }
    }

    public Car manufactureCar() {
        return builder.fixChassis().fixBody().paint().fixInterior().build();
    }
}
