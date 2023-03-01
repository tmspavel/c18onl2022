package simple.factory.method;

import java.util.ArrayList;
import simple.factory.method.IInstrument.Type;

public class MainInstrument {

    public static void main(String[] args) {
        ArrayList<IInstrument> instruments = new ArrayList<>();
        InstrumentFactory instrumentFactory = new InstrumentFactoryImpl();
        instruments.add(instrumentFactory.createInstrument(IInstrument.Type.GUITAR, 6));
        instruments.add(instrumentFactory.createInstrument(IInstrument.Type.DRUM, 10));
        instruments.add(instrumentFactory.createInstrument(IInstrument.Type.TRUMPET, 20));
        for (IInstrument instrument : instruments) {
//            instrument.play();
            if (instrument.getType() == Type.GUITAR) {
                Guitar guitar = (Guitar) instrument;
                guitar.test();
            }
        }
    }
}
