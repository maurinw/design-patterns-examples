package ch.patterns.state;

// Das State-Interface definiert die Methode, die von jedem konkreten Zustand implementiert wird.
// Die Methode handle() übernimmt als Parameter den Context, um bei Bedarf den Zustand zu ändern.
// Hier können auch mehrere spezifische Funktionen definiert werden
public interface State {
    void handle(Context context);
}
