package ch.patterns.observer.passive;

/*
 * Im passiven Observer Pattern erhält der Observer keine Zustandsdaten
 * als Parameter. Stattdessen muss er den Zustand selbst vom Subjekt abfragen.
 */
public interface Observer {
    void update();
}
