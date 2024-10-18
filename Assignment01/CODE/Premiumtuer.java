/** Premiumtuer.java
 * Grundlagen Business Innovation HS2024
 * @author: Gruppe 15: Celia Bührer, Pascal Dutoit, Frederik Petersen, Florian Pecher, Han Gao 
 * @version 18.10.2024
 * 
 */
public class Premiumtuer extends Produkt {
    // Instanzvariablen
    private static final int anzahlHolzeinheiten = 4;
    private static final int anzahlSchrauben = 5;
    private static final int anzahlGlaseinheiten = 5;
    private static final int anzahlFarbeinheiten = 1;
    private static final int anzahlKartoneinheiten = 5;
    private static final int anzahlProduktionsZeit = 30;

    // Konstruktor
    public Premiumtuer() {
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
    public int getanzahlFarbeinheiten() {
        return anzahlFarbeinheiten;
    }

    // Gibt die Anzahl der Kartoneinheiten zurück
    public int getanzahlKartoneinheiten() {
        return anzahlKartoneinheiten;
    }

    // Gibt die Produktionszeit zurück
    public int getanzahlProduktionsZeit() {
        return anzahlProduktionsZeit;
    }

    // Gibt die Anzahl der Glaseinheiten zurück
    public int getanzahlGlaseinheiten() {
        return anzahlGlaseinheiten;
    }

    // Methode, um die benötigten Ressourcen anzuzeigen
    public void zeigeRessourcen() {
        System.out.println("Premiumtür benötigt:");
        System.out.println(anzahlHolzeinheiten + " Holzeinheiten");
        System.out.println(anzahlSchrauben + " Schrauben");
        System.out.println(anzahlGlaseinheiten + " Glaseinheiten");
        System.out.println(anzahlFarbeinheiten + " Farbeinheiten");
        System.out.println(anzahlKartoneinheiten + " Kartoneinheiten");
    }
}
