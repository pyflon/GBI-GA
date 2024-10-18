/** Standardtuer.java
 * Grundlagen Business Innovation HS2024
 * @author: Gruppe 15: Celia Bührer, Pascal Dutoit, Frederik Petersen, Florian Pecher, Han Gao 
 * @version 18.10.2024
 * 
 */
public class Standardtuer extends Produkt {
    // Instanzvariablen
    private static final int anzahlHolzeinheiten = 2;
    private static final int anzahlSchrauben = 10;
    private static final int anzahlGlaseinheiten = 0;
    private static final int anzahlFarbeinheiten = 2;
    private static final int anzahlKartoneinheiten = 1;
    private static final int anzahlProduktionsZeit = 10;

    // Konstruktor
    public Standardtuer() {
        super(); // Ruft den Konstruktor der Produktklasse auf
    }

    // Gibt die Anzahl der Holzeinheiten zurück
    public int getanzahlHolzeinheiten() {
        return anzahlHolzeinheiten;
    }

    // Gibt die Anzahl der Schrauben zurück
    public int getanzahlSchrauben() {
        return anzahlSchrauben;
    }

    // Gibt die Anzahl der Farbeinheiten zurück
    public int anzahlFarbeinheiten() {
        return anzahlFarbeinheiten;
    }

    // Gibt die Anzahl der Kartoneinheiten zurück
    public int anzahlKartoneinheiten() {
        return anzahlKartoneinheiten;
    }

    // Gibt die Produktionszeit zurück
    public int anzahlProduktionsZeit() {
        return anzahlProduktionsZeit;
    }

    // Methode, um die benötigten Ressourcen anzuzeigen
    public void zeigeRessourcen() {
        System.out.println("Standardtür benötigt:");
        System.out.println(anzahlHolzeinheiten + " Holzeinheiten");
        System.out.println(anzahlSchrauben + " Schrauben");
        System.out.println(anzahlFarbeinheiten + " Farbeinheiten");
        System.out.println(anzahlKartoneinheiten + " Kartoneinheiten");
    }
}
