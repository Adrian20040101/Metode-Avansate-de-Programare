import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<SpielKarte>{
    private List<SpielKarte> karten;

    public Deck(List<SpielKarte> karten) {
        this.karten = karten;
    }

    public List<SpielKarte> getKarten() {
        return karten;
    }

    public void addKarte(SpielKarte karte){
        karten.add(karte);
    }

    public Iterator<SpielKarte> iterator(){
        return new DeckIterator(this);
    }
}
