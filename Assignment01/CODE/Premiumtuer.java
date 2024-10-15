
/**
 * Write a description of class Premiumtuer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Premiumtuer extends Produkt {
    // Instanzvariablen
    private static final int anzahlHolzeinheiten = 4;
    private static final int anzahlSchrauben = 5;
    private static final int anzahlGlaseinheiten = 5;
    private static final int anzahlFarbeinheiten = 1;
    private static final int anzahlKartoneinheiten = 5;
    private static final int anzahlProduktionsZeit = 30;

    // Konstruktor
    public Premiumtuer() {
        super(); // Ruft den Konstruktor der Produktklasse auf
    }

    
    public int getanzahlHolzeinheiten(){
        return anzahlHolzeinheiten;
    }
    
    public int getanzahlSchrauben(){
        return anzahlSchrauben;
    }
    

    public int anzahlFarbeinheiten(){
        return anzahlFarbeinheiten;
    }
    
    public int anzahlKartoneinheiten(){
        return anzahlKartoneinheiten;
    }
    
    public int anzahlProduktionsZeit(){
        return anzahlProduktionsZeit;
    }
    
    // Methode, um die benötigten Ressourcen anzuzeigen
    public void zeigeRessourcen() {
        System.out.println("Standardtür benötigt:");
        System.out.println(anzahlHolzeinheiten + " Holzeinheiten");
        System.out.println(anzahlSchrauben + " Schrauben");
        System.out.println(anzahlFarbeinheiten + " Farbeinheiten");
        System.out.println(anzahlKartoneinheiten + " Kartoneinheiten");
    }
}
