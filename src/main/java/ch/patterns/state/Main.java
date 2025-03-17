package ch.patterns.state;

// Testklasse zur Demonstration des State Patterns.
public class Main {
    public static void main(String[] args) {
        // Initialisierung des Context mit einem konkreten Zustand (ConcreteStateA).
        Context context = new Context(new ConcreteStateA());

        context.request(); // ConcreteStateA bearbeitet, wechselt zu ConcreteStateB
        context.request(); // ConcreteStateB bearbeitet, wechselt zu ConcreteStateA
        context.request(); // ConcreteStateA bearbeitet erneut, usw.
    }
}
