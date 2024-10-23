import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class FabrikTest {

    private Fabrik fabrik;

    @BeforeEach
    public void setUp() {
        // Arrange: Eine neue Instanz von Fabrik vor jedem Test initialisieren
        fabrik = new Fabrik();
    }
    
    @AfterEach
    public void tearDown() {
        // Statische Variablen nach jedem Test zurücksetzen
        Fabrik.anzahlStandardTueren = 0;
        Fabrik.anzahlPremiumTueren = 0;
    }

    @Test
    public void testBestellungAufgeben_withValidQuantities() {
        // Act: Eine Bestellung für 5 Standardtüren aufgeben
        fabrik.bestellungAufgeben(5, 0);
    
        // Assert: Prüfen, ob genau 5 Standardtüren bestellt wurden
        assertEquals(5, fabrik.getAnzahlStandardTueren()); // Sollte jetzt erfolgreich sein
    }

    @Test
    public void testBestellungAufgeben_withValidQuantities2() {
        // Arrange
        int standardTueren = 4;
        int premiumTueren = 3;
        int expectedStandardTueren = 4;
        int expectedPremiumTueren = 3;

        // Act: Eine Bestellung mit gültigen Mengen aufgeben
        fabrik.bestellungAufgeben(standardTueren, premiumTueren);

        // Assert: Überprüfen, ob die erste Bestellung die richtigen Standard- und Premiumtüren hat
        assertEquals(expectedStandardTueren, fabrik.getAnzahlStandardTueren());
        assertEquals(expectedPremiumTueren, fabrik.getAnzahlPremiumTueren());
    }

    @Test
    public void testBestellungAufgeben_withNegativeQuantities() {
        // Arrange
        int standardTueren = -2;
        int premiumTueren = -1;

        // Act: Eine Bestellung mit negativen Mengen aufgeben
        fabrik.bestellungAufgeben(standardTueren, premiumTueren);

        // Assert: Überprüfen, dass negative Werte als 0 behandelt werden
        assertEquals(0, fabrik.getAnzahlStandardTueren());
        assertEquals(0, fabrik.getAnzahlPremiumTueren());
    }

    @Test
    public void testBestellungenAusgeben() {
        // Arrange: Mehrere Bestellungen aufgeben
        fabrik.bestellungAufgeben(3, 2); // Bestellung 1
        fabrik.bestellungAufgeben(1, 0); // Bestellung 2

        // Act: Die Bestellungen ausgeben
        fabrik.bestellungenAusgeben();

        // Assert: Überprüfen, ob die richtige Anzahl an Bestellungen in der Liste gespeichert ist
        assertEquals(2, fabrik.getBestellungen().size());
    }

    @Test
    public void testBestellungsNrIncrement() {
        // Arrange
        int initialBestellungsNr = Fabrik.bestellungsNr;

        // Act: Eine Bestellung aufgeben und prüfen, ob die Bestellungsnummer korrekt inkrementiert wird
        fabrik.bestellungAufgeben(2, 1);  // Bestellung 1
        fabrik.bestellungAufgeben(4, 0);  // Bestellung 2

        // Assert: Prüfen, ob die Bestellungsnummer um 2 erhöht wurde
        assertEquals(initialBestellungsNr + 2, Fabrik.bestellungsNr);
    }

    @Test
    public void testBestellungBestaetigung() {
        // Arrange: Eine neue Bestellung erstellen
        Bestellung order = new Bestellung(2, 3, Fabrik.bestellungsNr);

        // Act: Die Bestellung bestätigen
        order.bestellungBestaetigen();

        // Assert: Überprüfen, ob das Bestätigungsflag auf true gesetzt wurde
        assertTrue(order.getBestellBestaetigung());
    }

    @Test
    public void testProduktZustand() {
        // Arrange: Ein neues Standardtür-Produkt erstellen
        Produkt produkt = new Standardtuer();

        // Act & Assert: Den Anfangszustand überprüfen und ändern
        assertEquals(Zustand.Bestellt, produkt.getZustand());  // Anfangszustand 'Bestellt'

        // Den Zustand auf 'In_Produktion' setzen und überprüfen
        produkt.setZustand(Zustand.In_Produktion);
        assertEquals(Zustand.In_Produktion, produkt.getZustand());  // Jetzt 'In_Produktion'

        // Den Zustand auf 'Geliefert' setzen und überprüfen
        produkt.setZustand(Zustand.Geliefert);
        assertEquals(Zustand.Geliefert, produkt.getZustand());  // Jetzt 'Geliefert'
    }

    @Test
    public void testStandardtuerResources() {
        // Arrange: Eine Standardtür erstellen
        Standardtuer standardTuer = new Standardtuer();

        // Act & Assert: Überprüfen, ob die Ressourcen für Standardtüren korrekt sind
        assertEquals(2, standardTuer.getanzahlHolzeinheiten());
        assertEquals(10, standardTuer.getanzahlSchrauben());
        assertEquals(2, standardTuer.anzahlFarbeinheiten());
        assertEquals(1, standardTuer.anzahlKartoneinheiten());
        assertEquals(10, standardTuer.anzahlProduktionsZeit());
    }

    @Test
    public void testPremiumtuerResources() {
        // Arrange: Eine Premiumtür erstellen
        Premiumtuer premiumTuer = new Premiumtuer();

        // Act & Assert: Überprüfen, ob die Ressourcen für Premiumtüren korrekt sind
        assertEquals(4, premiumTuer.getanzahlHolzeinheiten());
        assertEquals(5, premiumTuer.getanzahlSchrauben());
        assertEquals(5, premiumTuer.getanzahlGlaseinheiten());
        assertEquals(1, premiumTuer.getanzahlFarbeinheiten());
        assertEquals(5, premiumTuer.getanzahlKartoneinheiten());
        assertEquals(30, premiumTuer.getanzahlProduktionsZeit());
    }
}
