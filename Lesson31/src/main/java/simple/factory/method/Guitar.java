package simple.factory.method;

public class Guitar implements IInstrument {

    private final int numberOfString;

    public Guitar(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    @Override
    public void test() {
        System.out.println("sdfsdf");
    }

    @Override
    public void play() {
        System.out.println("Играет гитара, количество струн = " + numberOfString);
    }

    @Override
    public Type getType() {
        return Type.GUITAR;
    }
}
