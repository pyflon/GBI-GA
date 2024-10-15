------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Aufgabe 1
PURPOSE OF PROJECT: Grundlagen BI Übung
VERSION or DATE: 29.09.2024
HOW TO START THIS PROJECT: 
AUTHORS: Group 15
USER INSTRUCTIONS:

import java.util.ArrayList;

public class Fabrik {
    private ArrayList<Bestellung> bestellungen; // List to store all orders
    private int bestellungsNr;

    // Constructor
    public Fabrik() {
        bestellungen = new ArrayList<>();
        bestellungsNr = 1;
    }

    // Method to place an order
    public void bestellungAufgeben(int standardTueren, int premiumTueren) {
        Bestellung neueBestellung = new Bestellung(standardTueren, premiumTueren, bestellungsNr);
        bestellungen.add(neueBestellung);
        bestellungsNr++; // Increment the order number for each new order
    }

    // Method to display all orders
    public void bestellungenAusgeben() {
        for (Bestellung bestellung : bestellungen) {
            bestellung.bestellungAusgeben();
        }
    }

    // Main method for initial testing
    public static void main(String[] args) {
        Fabrik fabrik = new Fabrik();
        fabrik.bestellungAufgeben(5, 2); // 5 Standard doors, 2 Premium doors
        fabrik.bestellungAufgeben(3, 1); // 3 Standard doors, 1 Premium door
        fabrik.bestellungenAusgeben(); // Display all orders
    }
}
