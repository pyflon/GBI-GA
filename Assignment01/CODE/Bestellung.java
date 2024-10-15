
/** Bestellung.java
 * Grundlagen Business Innovation HS2024
 * @author: Gruppe 15: Celia Bührer, Pascal Dutoit, Frederik Petersen, Florian Pecher, Han Gao 
 * @version 10.10.2024
 * 
 */

//relevante ArrayList importieren
import java.util.ArrayList;

//Einführung der Klasse Bestellung 
// bestellte Produkte werden hier gespeichert
public class Bestellung {
    
    //Instanzenvariabeln setzen
    private boolean bestellBestaetigung; //true false für die Bestellbestätigung
    private int beschaffungsZeit; 
    private int bestellungsNr; 
    public int anzahlStandardTueren; 
    public int anzahlPremiumTueren; 
    
    private ArrayList<Produkt> bestellteProdukte; // ArrayList für die bestellten Produkte und greift auf die Klasse Produkt zu
    int standardTuerenCounter = anzahlStandardTueren; //Anzahl Standard Türen die zur Liste hinzugefügt werden
    int premiumTuerenCounter = anzahlPremiumTueren; //Anzahl Premium Türen
    
    /**
     * Konstruktor Bestellung: Ein neus Objekt des Types Bestellung mit der Bestellnummer (von Klasse Fabrik) wird erstellt.
     * 
     */

    // Konstruktor 
    public Bestellung(int standardTueren, int premiumTueren, int bestellungsNr) {
        this.anzahlStandardTueren = standardTueren;
        this.anzahlPremiumTueren = premiumTueren;
        this.bestellungsNr = Fabrik.bestellungsNr; 
        this.bestellBestaetigung = false; // Es liegt momentan noch keine Bestätigung vor, weshalb sie auf false gesetzt wird
        bestellteProdukte = new ArrayList<>();
        this.beschaffungsZeit = 0; //wird erst später kalkuliert - wichtig für folgende Aufgaben
        
        //Definiert die Bestellmenge für Standard Türen und vermeidet negative Wert
        if (standardTueren >= 0) {
            this.anzahlStandardTueren = standardTueren;
        }
        
        else{
            System.out.println("ACHTUNG: Negative Bestellung eingegeben, folglich wird Bestellmenge Standardtüren für Bestellung " + bestellungsNr + " = 0 gesetzt.");
            this.anzahlStandardTueren = 0;
            
        }
        
        //Definiert die Bestellmenge für Premium Türen und vermeidet negative Wert
        if (premiumTueren >= 0) {
            this.anzahlPremiumTueren = premiumTueren;
        }
        
        else{
            System.out.println("ACHTUNG: Negative Bestellung eingegeben, folglich wird Bestellmenge Premiumtüren für Bestellung " + bestellungsNr + " = 0 gesetzt.");
            this.anzahlPremiumTueren = 0;
            
        }

        this.bestellteProdukte = new ArrayList<Produkt>(); //eine ArrayList für alle bestellte Produkte innerhalb dieser Bestellung
        
        // Initialize counters with the number of doors
        int standardTuerenCounter = anzahlStandardTueren; // Number of standard doors to add
        int premiumTuerenCounter = anzahlPremiumTueren; // Number of premium doors to add 
        
        // Add standard doors to the list
        while (standardTuerenCounter > 0) {
            standardTuerenCounter--;
            Standardtuer standardTuerenToAdd = new Standardtuer();
            bestellteProdukte.add(standardTuerenToAdd);
        }
        // Add premium doors to the list
        while (premiumTuerenCounter > 0) {
            premiumTuerenCounter--;
            Premiumtuer premiumTuerenToAdd = new Premiumtuer();
            bestellteProdukte.add(premiumTuerenToAdd);
        }    
    }
    
    // Methode zum Bestellung zurückgeben
    public void bestellungBestaetigen() {
        this.bestellBestaetigung = true;
    }

    // Methode zeigt den aktuellen Status der Bestellungsbestätigung an (Wert: true oder false (default))
    public boolean getBestellBestaetigung() {
        return bestellBestaetigung;
    }

    // Methode zum Beschaffungszeit setten
    public void setBeschaffungsZeit(int zeit) {
        this.beschaffungsZeit = zeit;
    }

    // Method um Beschaffungszeit zurück. Momentan noch nicht berechnet
    public int getBeschaffungsZeit() {
        return beschaffungsZeit;
    }

    // Gibt die Bestellnummer wieder her
    public int getBestellungsNr() {
        return bestellungsNr;
    }

    // Gibt Standard Türen wieder
    public int getAnzahlStandardTueren() {
        return anzahlStandardTueren;
    }

    // Gibt Premium Türen wieder
    public int getAnzahlPremiumTueren() {
        return anzahlPremiumTueren;
    }
    
    // Methode um alle Bestellungensdetails anzuzeigen
    public void bestellungAusgeben() {
        System.out.println("\nBestellung #" + bestellungsNr + ":");
        System.out.println(anzahlStandardTueren + " Standardtüren");
        System.out.println(anzahlPremiumTueren + " Premiumtüren");
        System.out.println("Bestellbestätigung: " + bestellBestaetigung);
    }

}



