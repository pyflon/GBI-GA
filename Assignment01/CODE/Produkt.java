/** Produkt.java
 * Grundlagen Business Innovation HS2024
 * @author: Gruppe 15: Celia Bührer, Pascal Dutoit, Frederik Petersen, Florian Pecher, Han Gao 
 * @version 18.10.2024
 * 
 */
class Produkt {
    // Eine globale Variable, um den Zustand des Produkts zu speichern
    private Zustand zustand;

    // Enum: Mögliche Zustände des Produkts
    enum Zustand {
        Bestellt,       // Bestellt
        In_Produktion,  // In Produktion
        Geliefert       // Geliefert
    }

    // Konstruktor
    public Produkt() {
        this.zustand = Zustand.Bestellt; // Anfangszustand definieren
    }

    // Gibt den aktuellen Zustand des Produkts zurück
    public Zustand getZustand() {
        return this.zustand; // Aktuellen Zustand zurückgeben
    }

    // Setzt den aktuellen Zustand des Produkts
    public void setZustand(Zustand aktuellerZustand) {
        this.zustand = aktuellerZustand; // Zustand des Produkts aktualisieren
    }

    // Gibt die Integer-Darstellung des aktuellen Zustands zurück
    public int getIntZustand() {
        switch (this.zustand) {
            case Bestellt:
                return 1; // Bestellt
            case In_Produktion:
                return 2; // In Produktion
            case Geliefert:
                return 3; // Geliefert
            default:
                System.out.println("ACHTUNG: Es wurde kein gültiger Zustand gefunden");
                return 0; // Falls ein unbekannter Zustand auftritt
        }
    }

    // Methode, um den aktuellen Zustand als Integer zurückzugeben
    public int gibZustand() {
        return getIntZustand(); // Vorhandene Methode zur Integer-Darstellung wiederverwenden
    }
}
