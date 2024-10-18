/** Fabrik.java 
 * Grundlagen Business Innovation HS2024
 * @author: Gruppe 15: Celia Bührer, Pascal Dutoit, Frederik Petersen, Florian Pecher, Han Gao 
 * @version 18.10.2024
 * 
 */

//ArrayListe importieren
import java.util.ArrayList;

//Klasse Farbik definieren
public class Fabrik {
    private ArrayList<Bestellung> bestellungen; // Liste aller Bestellungen
    public static int bestellungsNr; // Eindeutige Bestellnummer
    public static int anzahlStandardTueren;
    public static int anzahlPremiumTueren;

    // Getter Methoden
    public int getAnzahlStandardTueren() {
        return anzahlStandardTueren;
    }

    public int getAnzahlPremiumTueren() {
        return anzahlPremiumTueren;
    }
    
    public ArrayList<Bestellung> getBestellungen() {
    return bestellungen;
    }

    // Konstruktor
    public Fabrik() {
        this.bestellungen = new ArrayList<Bestellung>();
        bestellungsNr = 1;
    }

    // Methode zum Aufgeben einer Bestellung
    public void bestellungAufgeben(int standardTueren, int premiumTueren) {
        Bestellung neueBestellung = new Bestellung(standardTueren, premiumTueren, bestellungsNr);
        neueBestellung.bestellungBestaetigen(); // Bestellung sofort bestätigen
        bestellungen.add(neueBestellung); // Hinzufügen zur Liste
        anzahlStandardTueren += neueBestellung.getAnzahlStandardTueren(); // Aktualisierung der total counts
        anzahlPremiumTueren += neueBestellung.getAnzahlPremiumTueren();
        bestellungsNr++; // Erhöhen der Bestellnummer
    }

    // Methode zur Ausgabe aller Bestellungen
    public void bestellungenAusgeben() {
        for (Bestellung bestellung : bestellungen) {
            System.out.println("\nGesamtübersicht aller Bestellungen:");
            bestellung.bestellungAusgeben(); // Ruft die Ausgabe der einzelnen Bestellung auf
        }
    }
}


