package ch.patterns.state;

public class ConcreteStateB implements State {

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateB bearbeitet die Anfrage.");
        context.setState(new ConcreteStateA()); // Hier wird der Context zurück in den Zustand ConcreteStateA versetzt.
    }
}
