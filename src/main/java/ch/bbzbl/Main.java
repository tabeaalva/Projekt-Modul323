package ch.bbzbl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Pfad zur JSON-Datei
            String jsonDateipfad = "src/main/resources/sterberateliste.json";

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

        } catch (Exception e) {
            e.printStackTrace();
            }
        }
}