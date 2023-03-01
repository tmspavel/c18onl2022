package simple.factory.method;

public class InstrumentFactoryImpl implements InstrumentFactory {

    public IInstrument createInstrument(IInstrument.Type iInstrument, int parameter) {
        return switch (iInstrument) {
            case DRUM -> new Drum(parameter);
            case GUITAR -> new Guitar(parameter);
            case TRUMPET -> new Trumpet(parameter);
        };
    }
}
