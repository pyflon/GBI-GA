/** Bestellung.java
 * Grundlagen Business Innovation HS2024
 * @author: Gruppe 15: Celia Bührer, Pascal Dutoit, Frederik Petersen, Florian Pecher, Han Gao 
 * @version 18.10.2024
 * 
 */

//relevante ArrayList importieren
import java.util.ArrayList;

//Einführung der Klasse Bestellung 
// bestellte Produkte werden hier gespeichert
public class Bestellung {
    
    //Instanzenvariabeln setzen
    private boolean bestellBestaetigung; // true false für die Bestellbestätigung
    private int beschaffungsZeit; 
    private int bestellungsNr; 
    public int anzahlStandardTueren; 
    public int anzahlPremiumTueren; 
    
    private ArrayList<Produkt> bestellteProdukte; // ArrayList für die bestellten Produkte und greift auf die Klasse Produkt zu
    int standardTuerenCounter = anzahlStandardTueren; // Anzahl Standard Türen, die zur Liste hinzugefügt werden
    int premiumTuerenCounter = anzahlPremiumTueren; // Anzahl Premium Türen
    
    /**
     * Konstruktor Bestellung: Ein neues Objekt des Types Bestellung mit der Bestellnummer (von Klasse Fabrik) wird erstellt.
     * 
     */

    // Konstruktor 
    public Bestellung(int standardTueren, int premiumTueren, int bestellungsNr) {
        this.anzahlStandardTueren = standardTueren;
        this.anzahlPremiumTueren = premiumTueren;
        this.bestellungsNr = Fabrik.bestellungsNr; 
        this.bestellBestaetigung = false; // Es liegt momentan noch keine Bestätigung vor, deshalb auf false gesetzt
        bestellteProdukte = new ArrayList<>();
        this.beschaffungsZeit = 0; // wird erst später kalkuliert - wichtig für folgende Aufgaben
        
        // Definiert die Bestellmenge für Standardtüren und vermeidet negative Werte
        if (standardTueren >= 0) {
            this.anzahlStandardTueren = standardTueren;
        }
        else{
            System.out.println("ACHTUNG: Negative Bestellung eingegeben, Bestellmenge Standardtüren für Bestellung " + bestellungsNr + " = 0 gesetzt.");
            this.anzahlStandardTueren = 0;
        }
        
        // Definiert die Bestellmenge für Premiumtüren und vermeidet negative Werte
        if (premiumTueren >= 0) {
            this.anzahlPremiumTueren = premiumTueren;
        }
        else{
            System.out.println("ACHTUNG: Negative Bestellung eingegeben, Bestellmenge Premiumtüren für Bestellung " + bestellungsNr + " = 0 gesetzt.");
            this.anzahlPremiumTueren = 0;
        }

        this.bestellteProdukte = new ArrayList<Produkt>(); // eine ArrayList für alle bestellten Produkte innerhalb dieser Bestellung
        
        // Initialize counters with the number of doors
        int standardTuerenCounter = anzahlStandardTueren; // Anzahl Standardtüren, die hinzugefügt werden
        int premiumTuerenCounter = anzahlPremiumTueren; // Anzahl Premiumtüren, die hinzugefügt werden
        
        // Standardtüren zur Liste hinzufügen
        while (standardTuerenCounter > 0) {
            standardTuerenCounter--;
            Standardtuer standardTuerenToAdd = new Standardtuer();
            bestellteProdukte.add(standardTuerenToAdd);
        }
        
        // Premiumtüren zur Liste hinzufügen
        while (premiumTuerenCounter > 0) {
            premiumTuerenCounter--;
            Premiumtuer premiumTuerenToAdd = new Premiumtuer();
            bestellteProdukte.add(premiumTuerenToAdd);
        }    
    }
    
    // Methode, um die Bestellung zu bestätigen
    public void bestellungBestaetigen() {
        this.bestellBestaetigung = true;
    }

    // Methode zeigt den aktuellen Status der Bestellbestätigung an (Wert: true oder false (default))
    public boolean getBestellBestaetigung() {
        return bestellBestaetigung;
    }

    // Methode, um die Beschaffungszeit zu setzen
    public void setBeschaffungsZeit(int zeit) {
        this.beschaffungsZeit = zeit;
    }

    // Methode, um die Beschaffungszeit zurückzugeben. Momentan noch nicht berechnet.
    public int getBeschaffungsZeit() {
        return beschaffungsZeit;
    }

    // Gibt die Bestellnummer wieder
    public int getBestellungsNr() {
        return bestellungsNr;
    }

    // Gibt die Anzahl der Standardtüren wieder
    public int getAnzahlStandardTueren() {
        return anzahlStandardTueren;
    }

    // Gibt die Anzahl der Premiumtüren wieder
    public int getAnzahlPremiumTueren() {
        return anzahlPremiumTueren;
    }
    
    // Methode, um alle Bestelldetails anzuzeigen
    public void bestellungAusgeben() {
        System.out.println("\nBestellung #" + bestellungsNr + ":");
        System.out.println(anzahlStandardTueren + " Standardtüren");
        System.out.println(anzahlPremiumTueren + " Premiumtüren");
        System.out.println("Bestellbestätigung: " + bestellBestaetigung);
    }
}
