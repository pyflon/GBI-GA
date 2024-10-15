
/**
 * Write a description of class FabrikTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FabrikTest {
    
    public static void main(String[] args) {
        Fabrik fabrik = new Fabrik();
        
        // Testfall 1: Leere Fabrik
        System.out.println("Test 1: Ausgabe ohne Bestellungen");
        fabrik.bestellungenAusgeben(); // Erwartet: Keine Ausgabe, da keine Bestellungen vorhanden
        
        // Testfall 2: Eine Bestellung aufgeben
        System.out.println("\nTest 2: Eine Bestellung aufgeben");
        fabrik.bestellungAufgeben(5, 3); // 5 Standardtüren, 3 Premiumtüren
        fabrik.bestellungenAusgeben(); // Erwartet: Ausgabe der Bestellung mit den genannten Türen
        
        // Testfall 3: Mehrere Bestellungen
        System.out.println("\nTest 3: Mehrere Bestellungen aufgeben");
        fabrik.bestellungAufgeben(2, 1); // Weitere Bestellung: 2 Standardtüren, 1 Premiumtür
        fabrik.bestellungAufgeben(10, 0); // Weitere Bestellung: 10 Standardtüren, 0 Premiumtüren
        fabrik.bestellungenAusgeben(); // Erwartet: Ausgabe aller drei Bestellungen
        
        // Testfall 4: Eine Bestellung mit negativer Bestellanzahl aufgeben
        System.out.println("\nTest 4: Negative Bestellung aufgeben");
        fabrik.bestellungAufgeben(-1, 1); // -1 Standardtüren, 1 Premiumtüren
        fabrik.bestellungenAusgeben(); // Erwartet: Ausgabe der Bestellung mit angepasster Bestellmenge (auf 0)
        
        // Testfall 5: Bestellnummern korrekt - EDIT: Nicht nötig, wird bereits in BestellungAusgeben gemacht!
        // System.out.println("\nTest 4: Überprüfen der Bestellnummern");
    }
}

