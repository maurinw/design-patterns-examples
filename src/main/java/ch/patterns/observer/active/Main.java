package ch.patterns.observer.active;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Observer1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setData("Zustand A");
        subject.removeObserver(observer1);
        subject.setData("Zustand B");
    }
}
