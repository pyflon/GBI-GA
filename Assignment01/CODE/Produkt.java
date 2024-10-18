/**
 * Represents a product with various states.
 */
class Produkt {
    // A global variable to hold the product's state
    private Zustand zustand;

    // Enum: Possible states of the product
    enum Zustand {
        Bestellt,       // Ordered
        In_Produktion,  // In Production
        Geliefert       // Delivered
    }

    // Constructor
    public Produkt() {
        this.zustand = Zustand.Bestellt; // Define the initial state
    }

    // Get the current state of the product
    public Zustand getZustand() {
        return this.zustand; // Return the current state
    }

    // Set the current state of the product
    public void setZustand(Zustand aktuellerZustand) {
        this.zustand = aktuellerZustand; // Update the product's state
    }

    // Get the integer representation of the current state
    public int getIntZustand() {
        switch (this.zustand) {
            case Bestellt:
                return 1; // Bestellt
            case In_Produktion:
                return 2; // In Produktion
            case Geliefert:
                return 3; // Geliefert
            default:
                System.out.println("ACHTUNG: Es wurde kein gültiger Zustand gefunden");
                return 0; // If an unknown state is encountered
        }
    }

    // Method to provide the current state as an integer
    public int gibZustand() {
        return getIntZustand(); // Reuse the existing integer representation method
    }
}
