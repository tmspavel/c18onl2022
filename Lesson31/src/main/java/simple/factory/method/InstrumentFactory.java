package simple.factory.method;

public interface InstrumentFactory {

    IInstrument createInstrument(IInstrument.Type iInstrument, int parameter);
}
