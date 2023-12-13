import java.util.ArrayList;
import java.util.List;

class Composition {
    private List<MusicalInstrument> instrumentsInComposition;

    public Composition() {
        instrumentsInComposition = new ArrayList<>();
    }

    public void addInstrument(MusicalInstrument musicalInstrument) {
        instrumentsInComposition.add(musicalInstrument);
    }

    public void removeInstrument(MusicalInstrument musicalInstrument) {
        instrumentsInComposition.remove(musicalInstrument);
    }

    public void playComposition() {
        for (MusicalInstrument musicalInstrument : instrumentsInComposition) {
            musicalInstrument.play();
        }
    }
}
