
/**
 * Write a description of class Produkt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Produkt 
{
    //eine globale Variabel wird gesetzt, damit die anderen Klassen auch zugriff drauf haben
    private Zustand zustand;
    
    //Enum: mögliche Zustände des Produkts wird vordefiniert, Enumeratuin der Klasse bestellZustand 
    enum Zustand { 
        Bestellt, //1
        In_Produktion, //2
        Geliefert //3
    }

    // Konstruktor 
    public Produkt() {
        this.zustand = Zustand.Bestellt; // Anfangszustand definieren
    }
    
    public Zustand getZustand(){
        return this.zustand; //Zustand zurückgeben
    }
    
    public int getIntZustand(){
        if(this.zustand == Zustand.Bestellt) {
            return (1); //Bestellt
        }
        else if (this.zustand == Zustand.In_Produktion){
            return (2); //In_Produktion
        }
        else if (this.zustand == Zustand.Geliefert){
            return (3); //Geliefert
        }
        else {
            System.out.println("ACHTUNG: Es wurde kein gültiger Zustand gefunden");
            return (0); 
        }
    }
    
  // Method to change the state of the product
    public void setZustand(Zustand aktuellerZustand) {
        this.zustand = aktuellerZustand; // Update the product's state
    }
    
    // Methode um Zustand eines Produkts festzulegen (int)
    public void setIntZustand(int aktuellerZustand){
        if (aktuellerZustand == 1) {
            setZustand(Zustand.Bestellt);
        }
        if (aktuellerZustand == 2) {
            setZustand(Zustand.In_Produktion);
        }
        if (aktuellerZustand == 3) {
            setZustand(Zustand.Geliefert);
        }
        else {
            System.out.println("Ungültiger Wert: Zustand bleibt unverändert. Erhaltener Wert:" + aktuellerZustand);
        }
    }   
    // Methode um den aktuellen Zustand des Produkts zu erhalten
    public int gibZustand(){
        switch (zustand) {
            case Bestellt:
                return 1;
            case In_Produktion:
                return 2; 
            case Geliefert:
                return 3; 
            default:
                return 0; //Falls ein unbekannter Zustand vorliegt
            }
        }
    }
 
        



