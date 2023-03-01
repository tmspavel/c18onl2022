package simple.factory.method;

public class Trumpet implements IInstrument {

    private final int diameter;


    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба, диаметр трубы = " + diameter);
    }

    @Override
    public Type getType() {
        return Type.TRUMPET;
    }
}
