public class Main {
    public static void main(String[] args) {

        InstrumentFactory guitarFactory = new GuitarFactory();
        InstrumentFactory pianoFactory = new PianoFactory();
        InstrumentFactory violinFactory = new ViolinFactory();

        MusicalInstrument guitar = guitarFactory.createInstrument();
        MusicalInstrument piano = pianoFactory.createInstrument();
        MusicalInstrument violin = violinFactory.createInstrument();

        Composition composition = new Composition();
        composition.addInstrument(guitar);
        composition.addInstrument(piano);
        composition.addInstrument(violin);
        composition.removeInstrument(violin);

        composition.playComposition();



    }
}