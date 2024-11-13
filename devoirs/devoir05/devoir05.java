import java.util.Scanner;

public class devoir05 {
    public static void main(String[] args) {
        //RIF: ici vous faites un nombre entre 1 et 39
        int nombreATrouver = (int) (Math.random() * (39 - 1 + 1)) + 1;
        int tentative = 0;
        int nmbrEssai = 0;
        Scanner scanner = new Scanner(System.in);
        boolean trouve = false;

        System.out.println("Essayez de deviner le nombre entre 1 et 100 !");

        while (!trouve) {
            System.out.print("Entrez votre nombre : ");
            tentative = scanner.nextInt();

            //RIF: la ligne suivante n'est pas nécessaire
            scanner.nextLine();

            if (tentative < nombreATrouver) {
                System.out.println("Trop petit");
                nmbrEssai++;
            } else if (tentative > nombreATrouver) {
                System.out.println("Trop grand");
                nmbrEssai++;
            } else {
                System.out.println("Bravo, tu as trouvé !");
                System.out.println("Cela t'a pris " + nmbrEssai + " essais");
                trouve = true;
            }
        }

        scanner.close();
    }
}
