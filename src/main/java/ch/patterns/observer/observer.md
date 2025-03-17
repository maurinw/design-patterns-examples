## Observer Pattern

### Definition
- Das Observer Pattern ist ein Verhaltensmuster, mit dem man einen Subscribe-Mechanismus definieren kann, um mehrere Objekte über Ereignisse zu benachrichtigen, die mit dem Objekt, das man beobachten, geschehen.

---

### Aufbau des Observer Patterns

Besteht typischerweise aus folgenden Komponenten:

- **Subject (Publisher)**: Das Objekt, dessen Zustandsänderungen beobachtet werden.
- **ConcreteSubject**: Konkrete Implementierung des Subjekts, das Observers verwaltet und benachrichtigt.
- **Observer (Subscriber)**: Schnittstelle (Interface), das von Observern implementiert wird, um Benachrichtigungen zu empfangen.
- **ConcreteObserver**: Konkrete Implementierung des Observer-Interfaces.

---

### Unterscheidung: Aktive und Passive Observer

- **Passiver Observer (Pull Modell)**: Wird vom Subjekt über eine Änderung informiert und erhält dabei alle relevanten Daten direkt übermittelt.
- **Aktiver Observer (Push Modell)**: Wird lediglich informiert, dass es eine Änderung gab, und holt sich anschließend selbstständig die relevanten Informationen vom Subjekt.

---