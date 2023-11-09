package ex1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{
    public List<Observer> observers;
    public int temperatur;
    public int luftfeuchtigkeit;
    public float luftdruck;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(temperatur, luftfeuchtigkeit, luftdruck);
        }
    }


    public void setMeasurements(int temperatur, int luftfeuchtigkeit, float luftdruck){
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.luftdruck = luftdruck;
        notifyObservers();
    }
}
