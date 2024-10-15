/** Fabrik.java 
 * Grundlagen Business Innovation HS2024
 * @author: Gruppe 15: Celia Bührer, Pascal Dutoit, Frederik Petersen, Florian Pecher, Han Gao 
 * @version 10.10.2024
 * 
 */

//ArrayListe importieren
import java.util.ArrayList;

//Klasse Farbik definieren
public class Fabrik {
    private ArrayList<Bestellung> bestellungen; // Liste aller Bestellungen
    public static int bestellungsNr; // Eindeutige Bestellnummer (NOCHMAL ANSCHAUEN)
    public static int anzahlStandardTueren;
    public static int anzahlPremiumTueren;

    // Getter Methoden
    public int getAnzahlStandardTueren() {
        return anzahlStandardTueren;
    }

    public int getAnzahlPremiumTueren() {
        return anzahlPremiumTueren;
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
        bestellungsNr++; // Erhöhen der Bestellnummer
    }

    // Methode zur Ausgabe aller Bestellungen
    public void bestellungenAusgeben() {
        //System.out.println("Es folgen alle " + bestellungen.size() + " Bestellungen aufgelistet."); // ausgelassen weil bei keiner Bestellung auch gesagt
        for (Bestellung bestellung : bestellungen) {
            System.out.println("\nGesamtübersicht aller Bestellungen:");
            bestellung.bestellungAusgeben(); // Ruft die Ausgabe der einzelnen Bestellung auf
            // Entferne die folgende Zeile, um doppelte Ausgaben zu vermeiden
            // System.out.println("Standardtüren: " + bestellung.getAnzahlStandardTueren() + " | Premiumtüren: " + bestellung.getAnzahlPremiumTueren());
        }
    }
}


