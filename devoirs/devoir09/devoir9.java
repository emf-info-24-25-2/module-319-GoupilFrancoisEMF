import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class devoir9 {
    // Déclaration des constantes
    private static final int NBRE_CHIFFRES = 6;
    private static final int MIN = 0;
    private static final int MAX = 42;

    // Méthode pour générer un tirage de loto sans doublons
    public static int[] genereTirage(int nombreChiffres, int min, int max) {
        int[] tirage = new int[nombreChiffres];
        Set<Integer> chiffresUtilises = new HashSet<>();
        Random random = new Random();
        int index = 0;

        while (index < nombreChiffres) {
            int chiffreAleatoire = random.nextInt((max - min) + 1) + min;
            if (!chiffresUtilises.contains(chiffreAleatoire)) {
                tirage[index] = chiffreAleatoire;
                chiffresUtilises.add(chiffreAleatoire);
                index++;
            }
        }

        return tirage;
    }

    // Méthode principale
    public static void main(String[] args) {
        int[] tirageLoto = genereTirage(NBRE_CHIFFRES, MIN, MAX);
        System.out.println("Tirage du loto :");
        for (int chiffre : tirageLoto) {
            System.out.println(chiffre);
        }
    }
}
