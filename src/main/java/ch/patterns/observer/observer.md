## Observer Pattern

### Definition
- **Kategorie**: Verhaltensmuster (Behavioral Patterns).
- **Zweck**: Definiert eine Eins-zu-Viele-Abhängigkeit zwischen einem Subjekt (Publisher) und mehreren Observern (Subscriber). Änderungen im Subjekt werden automatisch an die Observer weitergegeben.

---

### Aufbau des Observer Patterns

Besteht typischerweise aus folgenden Komponenten:

- **Subject (Publisher)**: Das Objekt, dessen Zustandsänderungen beobachtet werden.
- **Observer (Subscriber)**: Schnittstelle (Interface), das von Observern implementiert wird, um Benachrichtigungen zu empfangen.
- **ConcreteObserver**: Konkrete Implementierung des Observer-Interfaces.
- **ConcreteSubject**: Konkrete Implementierung des Subjekts, das Observers verwaltet und benachrichtigt.

---

### Unterscheidung: Aktive und Passive Observer

- **Passiver Observer**: Wird vom Subjekt über eine Änderung informiert und erhält dabei alle relevanten Daten direkt übermittelt.
- **Aktiver Observer**: Wird lediglich informiert, dass es eine Änderung gab, und holt sich anschließend selbstständig die relevanten Informationen vom Subjekt.

---