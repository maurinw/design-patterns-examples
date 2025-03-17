package ch.patterns.observer.passive;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String data;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Benachrichtigt alle Observer, ohne den neuen Zustand zu übergeben.
    // Die Observer müssen den Zustand selbst vom Subjekt abfragen.
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    // Methode zum Setzen des neuen Zustands und anschließenden Benachrichtigen der Observer.
    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }

    // Getter, den die Observer nutzen, um den aktuellen Zustand abzurufen.
    public String getData() {
        return data;
    }
}
