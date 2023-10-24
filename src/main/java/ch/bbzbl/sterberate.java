package ch.bbzbl;

public class Sterberate {

 private String jahr;
 private int monat;
 private String wochentag;
 private String sterbedatum;
 private String anz_total;

    public Sterberate() {
    }

    public Sterberate(String jahr, int monat, String wochentag, String sterbedatum, String anz_total) {
        this.jahr = jahr;
        this.monat = monat;
        this.wochentag = wochentag;
        this.sterbedatum = sterbedatum;
        this.anz_total = anz_total;
    }
    
    public void setJahr(String jahr) {
        this.jahr = jahr;
    }
    public String getJahr() {
        return jahr;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }
    public int getMonat() {
        return monat;
    }

    public void setWochentag(String wochentag) {
        this.wochentag = wochentag;
    }
    public String getWochentag() {
        return wochentag;
    }

    public void setSterbedatum(String sterbedatum) {
        this.sterbedatum = sterbedatum;
    }
    public String getSterbedatum() {
        return sterbedatum;
    }

    public void setAnzTotal(String anz_total) {
        this.anz_total = anz_total;
    }
    public String getAnzTotal() {
        return anz_total;
    }
    // Konstruktor, Getter und Setter hier...

    // Stelle sicher, dass du einen Standardkonstruktor ohne Argumente für Gson hast
}
