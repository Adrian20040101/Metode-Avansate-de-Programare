public class SpielKarte {
    private Color color;
    private int value;

    public SpielKarte(Color color, int value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SpielKarte{" +
                "color=" + color +
                ", value=" + value +
                '}';
    }
}
