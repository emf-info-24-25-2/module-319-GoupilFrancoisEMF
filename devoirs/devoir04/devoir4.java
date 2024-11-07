 public class devoir4 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 11;
        int day = 30;

        System.out.println("La date entrée est le " + day + "." + month + "." + year);

        if (year < 0 || year > 9999) {
            System.out.println("L'année [" + year + "] est hors limites !");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Le mois [" + month + "] est hors limites !");
            return;
        }

        int maxDays;
        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }

        if (day < 1 || day > maxDays) {
            System.out.println("Le jour [" + day + "] est hors limites !");
            return;
        }

        String monthText;
        switch (month) {
            case 1: monthText = "janvier"; break;
            case 2: monthText = "février"; break;
            case 3: monthText = "mars"; break;
            case 4: monthText = "avril"; break;
            case 5: monthText = "mai"; break;
            case 6: monthText = "juin"; break;
            case 7: monthText = "juillet"; break;
            case 8: monthText = "août"; break;
            case 9: monthText = "septembre"; break;
            case 10: monthText = "octobre"; break;
            case 11: monthText = "novembre"; break;
            case 12: monthText = "décembre"; break;
            default: monthText = ""; 
        }

        System.out.println("La date formatée est le " + day + " " + monthText + " " + year);
    }
}