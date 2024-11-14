import java.util.Random;

public class Devoir07 {
    // Déclaration des constantes
    private static final int TAILLE_TABLEAU = 10;
    private static final int MIN_NOMBRE = -8;
    private static final int MAX_NOMBRE = 8;
    private static final int VALEUR_RECHERCHEE = 7;

    // Méthode pour générer un tableau de valeurs aléatoires
    public static int[] genererValeursAleatoires(int taille, int min, int max) {
        int[] tableau = new int[taille];
        Random random = new Random();
        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(max - min + 1) + min;
        }
        return tableau;
    }

    // Méthode pour rechercher la première position d'une valeur dans le tableau
    public static int positionValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    // Méthode principale
    public static void main(String[] args) {
        // Génération du tableau
        int[] tableau = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);

        // Affichage des informations
        System.out.println("Devoir 07 du module 319");
        System.out.println("---------------------------------------");
        System.out.println("Le tableau d'entiers généré contient : " + TAILLE_TABLEAU + " valeurs");

        // Affichage des deux premières et deux dernières valeurs
        System.out.println("Les deux premières/dernières valeurs sont : [" + tableau[0] + "][" + tableau[1] + "] ... [" + tableau[TAILLE_TABLEAU - 2] + "][" + tableau[TAILLE_TABLEAU - 1] + "]");

        // Recherche de la position de VALEUR_RECHERCHEE
        int position = positionValeur(tableau, VALEUR_RECHERCHEE);
        if (position != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " figure à la position N°" + position + " du tableau !");
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " n'est pas présente dans le tableau.");
        }

        // Affichage du contenu du tableau
        System.out.println("Voici le contenu du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "] = " + tableau[i]);
        }
    }
}

