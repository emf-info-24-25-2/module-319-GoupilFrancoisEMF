import java.util.Random;

public class devoir6 {
    // Déclaration des constantes
    private static final int TAILLE_TABLEAU = 20;
    private static final int VALEUR_MIN = 0;
    private static final int VALEUR_MAX = 50;
    private static final int VALEUR_RECHERCHEE = 7;

    // Méthode pour générer un tableau de valeurs aléatoires
    public static int[] genereTableau(int taille, int min, int max) {
        int[] tableau = new int[taille];
        Random random = new Random();
        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(max - min + 1) + min;
        }
        return tableau;
    }

    // Méthode pour rechercher la valeur minimale
    public static int rechercheMin(int[] tableau) {
        int min = tableau[0];
        for (int valeur : tableau) {
            if (valeur < min) {
                min = valeur;
            }
        }
        return min;
    }

    // Méthode pour rechercher la valeur maximale
    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
        for (int valeur : tableau) {
            if (valeur > max) {
                max = valeur;
            }
        }
        return max;
    }

    // Méthode pour rechercher une valeur dans le tableau
    public static int rechercheValeur(int[] tableau, int valeur) {
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
        int[] tableau = genereTableau(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);

        // Affichage du contenu du tableau
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "] = [" + tableau[i] + "]");
        }

        // Affichage de la valeur minimale
        int min = rechercheMin(tableau);
        System.out.println("La plus petite valeur trouvée est : " + min);

        // Affichage de la valeur maximale
        int max = rechercheMax(tableau);
        System.out.println("La plus grande valeur trouvée est : " + max);

        // Recherche de la valeur spécifiée
        int position = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        System.out.println("Le nombre [" + VALEUR_RECHERCHEE + "] est à la position [" + position + "] du tableau");
    }
}