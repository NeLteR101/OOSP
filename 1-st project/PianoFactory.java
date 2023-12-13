class PianoFactory extends InstrumentFactory{
    public MusicalInstrument createInstrument() {
        return new Piano();
    }
}
