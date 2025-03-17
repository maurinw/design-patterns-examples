package ch.patterns.state;

public class Context {
    private State currentState; // Referenz auf den aktuellen Zustand.

    // Konstruktor: Setzt den initialen Zustand.
    public Context(State initialState) {
        this.currentState = initialState;
    }

    // Setzt einen neuen Zustand. Damit kann ein Zustandwechsel erfolgen.
    public void setState(State newState) {
        this.currentState = newState;
    }

    // Diese Methode delegiert den Aufruf an die handle()-Methode des aktuellen Zustands.
    public void request() {
        currentState.handle(this);
    }
}
