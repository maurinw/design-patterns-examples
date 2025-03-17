package ch.patterns.observer.passive;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Observer1", subject);
        ConcreteObserver observer2 = new ConcreteObserver("Observer2", subject);

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // Beim Ändern des Zustands werden die Observer nur benachrichtigt.
        // Sie müssen den neuen Zustand selbst vom Subjekt abfragen.
        subject.setData("Zustand A");
        subject.removeObserver(observer1);
        subject.setData("Zustand B");
    }
}
