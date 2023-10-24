package ch.bbzbl;

import java.util.List;
import java.util.stream.Collectors;

public class rechner {
    public long filterByWochentag(List<Sterberate> sterberateListe, String targetWochentag) {
        long count = 0;
    
        for (Sterberate sterberate : sterberateListe) {
            if (sterberate.getWochentag().equals(targetWochentag)) {
                count++;
                System.out.println("Jahr: " + sterberate.getJahr());
                System.out.println("Monat: " + sterberate.getMonat());
                System.out.println("Wochentag: " + sterberate.getWochentag());
                System.out.println("Sterbedatum: " + sterberate.getSterbedatum());
                System.out.println("Anz Total: " + sterberate.getAnzTotal());
                System.out.println();
            }
        }
    
        System.out.println("Anzahl der Todesfälle an " + targetWochentag + ": " + count);
        return count;
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
        int totalDeaths = 0;
    
        for (Sterberate sterberate : sterberateListe) {
            if (Integer.parseInt(sterberate.getJahr()) == targetYear) {
                totalDeaths += Integer.parseInt(sterberate.getAnzTotal());
            }
        }
    
        System.out.println("Gesamtzahl der Todesfälle im Jahr " + targetYear + ": " + totalDeaths);
    }
    
}
