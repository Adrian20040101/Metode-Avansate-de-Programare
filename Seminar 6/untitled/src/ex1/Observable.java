package ex1;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
