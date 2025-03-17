package ch.patterns.observer.passive;

public class ConcreteObserver implements Observer {
    private String name;
    private ConcreteSubject subject;

    // Der Observer erhält eine Referenz auf das Subjekt, um den Zustand abzufragen.
    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    // Der Observer ruft den neuen Zustand selbst vom Subjekt ab.
    @Override
    public void update() {
        String data = subject.getData();
        System.out.println("Passiver Observer " + name + " ruft den neuen Zustand ab: " + data);
    }
}
