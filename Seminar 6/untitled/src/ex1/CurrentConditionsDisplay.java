package ex1;

public class CurrentConditionsDisplay implements Observer, Display{
    public WeatherData weatherData;
    public int temperatur;
    public int luftfeuchtigkeit;
    public float luftdruck;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.add(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperatur + " " + luftfeuchtigkeit + " " + luftdruck);
    }

    @Override
    public void update(int temperatur, int luftfeuchtigkeit, float luftdruck) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.luftdruck = luftdruck;
        display();
    }

}
