import java.util.Iterator;

public class DeckIterator implements Iterator<SpielKarte> {

    private int index = 0;
    private Deck deck;

    public DeckIterator(Deck deck) {
        this.deck = deck;
    }
    @Override
    public boolean hasNext() {
        return index < deck.getKarten().size();
    }

    @Override
    public SpielKarte next() {
        if (hasNext()) return deck.getKarten().get(index++);
        throw new IndexOutOfBoundsException();
    }
}
