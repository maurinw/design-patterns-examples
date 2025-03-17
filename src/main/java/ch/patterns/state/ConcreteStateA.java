package ch.patterns.state;

public class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateA bearbeitet die Anfrage.");
        context.setState(new ConcreteStateB());  // Hier wird der Context in den Zustand ConcreteStateB versetzt.
    }
}
