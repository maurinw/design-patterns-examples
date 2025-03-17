package ch.patterns.observer.active;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println("Aktiver Observer " + name + " erhält den neuen Zustand: " + data);
    }
}
