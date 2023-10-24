package ch.bbzbl;

import java.util.Scanner;
import java.util.List;

public class gui {

    public static void KonsoleAnzeige(List<Sterberate> sterberateListe) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
    
        System.out.println("\n∏=== Sterbedaten-Analyse-Menü ===");
=======

        System.out.println("\n=== Sterbedaten-Analyse-Menü ===");
>>>>>>> 2a008a1192d7cac43c9651a8283777658ef2e2bf
        System.out.println("1. Filtern nach Wochentag");
        System.out.println("2. Höchster Wert der Wochen eines Jahres");
        System.out.println("3. Gesamtzahl der Todesfälle in einem Jahr");
        System.out.println("4. Beenden");
        System.out.print("Bitte wählen Sie eine Option (1/2/3/4): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Verbrauche das Zeilenende nach der Eingabe.

        rechner rechner = new rechner();

        switch (choice) {
            case 1:
                System.out.print("Geben Sie den gewünschten Wochentag ein (z.B. 'Mi'): ");
                String targetWochentag = scanner.nextLine();
                rechner.filterByWochentag(sterberateListe, targetWochentag);
                break;
            case 2:
                System.out.print("Geben Sie das Jahr ein, für das Sie den höchsten Wochenwert ermitteln möchten: ");
                int year = scanner.nextInt();
                rechner.findMaxWeekValueForYear(sterberateListe, year);
                break;
            case 3:
                System.out.print("Geben Sie das Jahr ein, für das Sie die Gesamtzahl der Todesfälle ermitteln möchten: ");
                int targetYear = scanner.nextInt();
                rechner.calculateTotalDeathsForYear(sterberateListe, targetYear);
                break;
            case 4:
                System.out.println("Das Programm wird beendet.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Ungültige Auswahl. Bitte wählen Sie eine der verfügbaren Optionen (1/2/3/4).");
        }
    }
}
