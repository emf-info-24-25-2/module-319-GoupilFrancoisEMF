import java.util.Scanner;

public class devoir3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jour = 25;
        int mois = 9;
        int annee = 2024;
        
        int jourAnnee = jour;
        switch (mois) {
            case 12: jourAnnee += 30;
            case 11: jourAnnee += 31;
            case 10: jourAnnee += 30;
            case 9: jourAnnee += 31;
            case 8: jourAnnee += 31;
            case 7: jourAnnee += 30;
            case 6: jourAnnee += 31;
            case 5: jourAnnee += 30;
            case 4: jourAnnee += 31;
            case 3: 
                if (isLeapYear(annee)) {
                    jourAnnee += 29;
                } else {
                    jourAnnee += 28;
                }
            case 2: jourAnnee += 31;
        }
        
        if (jour <= 0 || jour > 31 || mois <= 0 || mois > 12 || annee < 0 || annee > 9999) {
            System.out.println("Date invalide");
        } else {
            System.out.println("C'est le jour n° " + jourAnnee + " de l'année.");
        }
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}