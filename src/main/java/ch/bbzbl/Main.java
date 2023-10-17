package ch.bbzbl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD

        System.out.println("hello");
    try {
    // Pfad zur JSON-Datei
    String jsonDateipfad = "sterberateliste.json";
=======
        try {
            // Pfad zur JSON-Datei
            String jsonDateipfad = "sterberateliste.json";
>>>>>>> 99eed544016b6bdaa465c5cd91534d10ea83e68c

            // Gson-Objekt erstellen
            Gson gson = new Gson();

            // JSON-Datei einlesen und in eine Liste von sterberate-Objekten umwandeln
            Type sterberateListeType = new TypeToken<List<Sterberate>>(){}.getType();
            Reader reader = new FileReader(jsonDateipfad);
            List<Sterberate> sterberateListe = gson.fromJson(reader, sterberateListeType);

            // Ausgabe der Benutzerdaten
            for (Sterberate sterberate : sterberateListe) {
            System.out.println("Jahr: " + sterberate.getJahr());
            System.out.println("Monat: " + sterberate.getMonat());
            System.out.println("Wochentag: " + sterberate.getWochentag());
            System.out.println("Sterbedatum: " + sterberate.getSterbedatum());
            System.out.println("Anz Total: " + sterberate.getAnzTotal());
            System.out.println();
            }

<<<<<<< HEAD
    } catch (Exception e) {
    e.printStackTrace();
    }
    }

   

=======
        } catch (Exception e) {
            e.printStackTrace();
            }
        }
>>>>>>> 99eed544016b6bdaa465c5cd91534d10ea83e68c
}