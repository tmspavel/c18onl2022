package com.tms.instruments;

import java.util.ArrayList;

public class MainInstrument {

    public static void main(String[] args) {
        ArrayList<IInstrument> instruments = new ArrayList<>();
        instruments.add(createInstrument(IInstrument.Type.GUITAR, 6));
        instruments.add(createInstrument(IInstrument.Type.DRUM, 10));
        instruments.add(createInstrument(IInstrument.Type.TRUMPET, 20));
        for (IInstrument instrument : instruments) {
            instrument.play();
        }
    }

    private static IInstrument createInstrument(IInstrument.Type iInstrument, int parameter) {
        return switch (iInstrument) {
            case DRUM -> new Drum(parameter);
            case GUITAR -> new Guitar(parameter);
            case TRUMPET -> new Trumpet(parameter);
        };
    }
}
