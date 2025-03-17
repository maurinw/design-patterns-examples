package ch.patterns.observer.active;

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

    @Override
    public void notifyObservers() {
        // Informiert alle Observer und übergibt dabei den neuen Zustand
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    // Methode zum Setzen des neuen Zustands und anschließenden Benachrichtigen der Observer
    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }
}
