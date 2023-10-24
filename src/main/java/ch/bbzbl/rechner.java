package ch.bbzbl;

import java.util.List;
import java.util.stream.Collectors;

public class rechner {

    public void filterByWochentag(List<Sterberate> sterberateListe, String targetWochentag) {
        List<Sterberate> filteredList = sterberateListe.stream()
                .filter(sterberate -> sterberate.getWochentag().equals(targetWochentag))
                .collect(Collectors.toList());

        System.out.println("Anzahl der Todesfälle an " + targetWochentag + ": " + filteredList.size());

    }

    public void findMaxWeekValueForYear(List<Sterberate> sterberateListe, int year) {
        int maxWeekValue = 0;
        for (Sterberate sterberate : sterberateListe) {
            if (Integer.parseInt(sterberate.getJahr()) == year) {
                int weekValue = Integer.parseInt(sterberate.getSterbedatum().split("-")[1]);
                if (weekValue > maxWeekValue) {
                    maxWeekValue = weekValue;
                }
            }
        }
        System.out.println("Höchster Wochenwert für das Jahr " + year + ": " + maxWeekValue);
    }

    public void calculateTotalDeathsForYear(List<Sterberate> sterberateListe, int targetYear) {
        int totalDeaths = sterberateListe.stream()
                .filter(sterberate -> Integer.parseInt(sterberate.getJahr()) == targetYear)
                .map(sterberate -> Integer.parseInt(sterberate.getAnzTotal()))
                .reduce(0, Integer::sum);

        System.out.println("Gesamtzahl der Todesfälle im Jahr " + targetYear + ": " + totalDeaths);
    }
}
