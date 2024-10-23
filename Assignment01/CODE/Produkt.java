/** Produkt.java
 * Grundlagen Business Innovation HS2024
 * @author: Gruppe 15: Celia Bührer, Pascal Dutoit, Frederik Petersen, Florian Pecher, Han Gao 
 * @version 18.10.2024
 * 
 */
class Produkt {
    // Eine globale Variable, um den Zustand des Produkts zu speichern
    private Zustand zustand;

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
}
