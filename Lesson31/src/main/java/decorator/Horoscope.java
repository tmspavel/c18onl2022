package decorator;

public class Horoscope implements Service {

    private String label;
    private double price;

    public Horoscope(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }
}
