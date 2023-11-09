package ex1;

public class ForecastDisplay implements Observer, Display{
    public WeatherData weatherData;
    public int temperatur;
    public int luftfeuchtigkeit;
    public float luftdruck;
    public ForecastDisplay(WeatherData weatherData) {
        weatherData.add(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast conditions: " + temperatur + " " + luftfeuchtigkeit + " " + luftdruck);
    }

    @Override
    public void update(int temperatur, int luftfeuchtigkeit, float luftdruck) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.luftdruck = luftdruck;
        display();
    }
}
