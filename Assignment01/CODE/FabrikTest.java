import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class FabrikTest {

    private Fabrik fabrik;

    @BeforeEach
    public void setUp() {
        // Arrange: Initialize a new instance of Fabrik before each test
        fabrik = new Fabrik();
    }
    
    @Test
    public void testBestellungAufgeben_withValidQuantities() {
        Fabrik fabrik = new Fabrik();  // Start with a clean state
    
        // Act: Place an order for 5 standard doors
        fabrik.bestellungAufgeben(5, 0);
    
        // Assert: Check if exactly 5 standard doors were ordered
        assertEquals(5, fabrik.getAnzahlStandardTueren()); // Should now pass
    }

    @Test
    public void testBestellungAufgeben_withValidQuantities2() {
        // Arrange
        int standardTueren = 4;
        int premiumTueren = 3;
        int expectedStandardTueren = 4;
        int expectedPremiumTueren = 3;

        // Act: Place an order with valid quantities
        fabrik.bestellungAufgeben(standardTueren, premiumTueren);

        // Assert: Verify the first order has correct standard and premium door quantities
        assertEquals(expectedStandardTueren, fabrik.getAnzahlStandardTueren());
        assertEquals(expectedPremiumTueren, fabrik.getAnzahlPremiumTueren());
    }

    @Test
    public void testBestellungAufgeben_withNegativeQuantities() {
        // Arrange
        int standardTueren = -2;
        int premiumTueren = -1;

        // Act: Place an order with negative quantities
        fabrik.bestellungAufgeben(standardTueren, premiumTueren);

        // Assert: Verify that negative values are handled as 0
        assertEquals(0, fabrik.getAnzahlStandardTueren());
        assertEquals(0, fabrik.getAnzahlPremiumTueren());
    }

    @Test
    public void testBestellungenAusgeben() {
        // Arrange: Place multiple orders
        fabrik.bestellungAufgeben(3, 2); // Order 1
        fabrik.bestellungAufgeben(1, 0); // Order 2

        // Act: Output the orders
        fabrik.bestellungenAusgeben();

        // Assert: Verify the correct number of orders is stored in the list
        assertEquals(2, fabrik.getBestellungen().size());
    }

    @Test
    public void testBestellungsNrIncrement() {
        // Arrange
        int initialBestellungsNr = Fabrik.bestellungsNr;

        // Act: Place an order and check if bestellungsNr increments correctly
        fabrik.bestellungAufgeben(2, 1);  // Order 1
        fabrik.bestellungAufgeben(4, 0);  // Order 2

        // Assert: Check that bestellungsNr incremented by 2
        assertEquals(initialBestellungsNr + 2, Fabrik.bestellungsNr);
    }

    @Test
    public void testBestellungBestaetigung() {
        // Arrange: Create a new order
        Bestellung order = new Bestellung(2, 3, Fabrik.bestellungsNr);

        // Act: Confirm the order
        order.bestellungBestaetigen();

        // Assert: Check that the confirmation flag is set to true
        assertTrue(order.getBestellBestaetigung());
    }

    @Test
    public void testProduktZustand() {
        // Arrange: Create a new Standard door product
        Produkt produkt = new Standardtuer();

        // Act & Assert: Check the initial state and change it
        assertEquals(1, produkt.getIntZustand());  // Initially 'Bestellt'

        // Set the state to 'In_Produktion' and verify
        produkt.setZustand(Produkt.Zustand.In_Produktion);
        assertEquals(2, produkt.getIntZustand());  // Now 'In_Produktion'

        // Set the state to 'Geliefert' and verify
        produkt.setZustand(Produkt.Zustand.Geliefert);
        assertEquals(3, produkt.getIntZustand());  // Now 'Geliefert'
    }

    @Test
    public void testStandardtuerResources() {
        // Arrange: Create a standard door
        Standardtuer standardTuer = new Standardtuer();

        // Act & Assert: Check if the resources for standard door are correct
        assertEquals(2, standardTuer.getanzahlHolzeinheiten());
        assertEquals(10, standardTuer.getanzahlSchrauben());
        assertEquals(2, standardTuer.anzahlFarbeinheiten());
        assertEquals(1, standardTuer.anzahlKartoneinheiten());
        assertEquals(10, standardTuer.anzahlProduktionsZeit());
    }

    @Test
    public void testPremiumtuerResources() {
        // Arrange: Create a premium door
        Premiumtuer premiumTuer = new Premiumtuer();

        // Act & Assert: Check if the resources for premium door are correct
        assertEquals(4, premiumTuer.getanzahlHolzeinheiten());
        assertEquals(5, premiumTuer.getanzahlSchrauben());
        assertEquals(5, premiumTuer.getanzahlGlaseinheiten());
        assertEquals(1, premiumTuer.getanzahlFarbeinheiten());
        assertEquals(5, premiumTuer.getanzahlKartoneinheiten());
        assertEquals(30, premiumTuer.getanzahlProduktionsZeit());
    }
}
