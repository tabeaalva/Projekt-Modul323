package ch.bbzbl;

public class sterberate {
 private String jahr;
 private int monat;
 private String wochentag;
 private String sterberate;
 private String anzTotal;

    public void Sterberate() {
    }

    public void Sterberate(String jahr, int monat, String wochentag, String sterberate, String anzTotal) {
        this.jahr = jahr;
        this.monat = monat;
        this.wochentag = wochentag;
        this.sterberate = sterberate;
        this.anzTotal = anzTotal;
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

    public void setWoochentag(String wochentag) {
        this.wochentag = wochentag;
    }
    public String getWochentag() {
        return wochentag;
    }

    public void setSterbedatum(String sterberate) {
        this.sterberate = sterberate;
    }
    public String getSterbedatum() {
        return sterberate;
    }

    public void setAnzTotal(String anzTotal) {
        this.anzTotal = anzTotal;
    }
    public String getAnzTotal() {
        return anzTotal;
    }
    // Konstruktor, Getter und Setter hier...

    // Stelle sicher, dass du einen Standardkonstruktor ohne Argumente für Gson hast
}
