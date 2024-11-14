import java.util.Random;

public class GenerateurMotDePasse {
    // Déclaration des constantes
    private static final String[] CARACTERES = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    private static final int NBR_ESSAI = 5;
    private static final int TAILLE_MOT_DE_PASSE = 15;

    // Méthode pour générer un mot de passe aléatoire de la taille spécifiée
    public static String genereMotDePasse(int taille) {
        String resultat = "";
        Random random = new Random();
        
        while (resultat.length() < taille) {
            int positionAleatoire = random.nextInt(CARACTERES.length);
            resultat += CARACTERES[positionAleatoire];
        }
        
        return resultat;
    }

    // Méthode principale
    public static void main(String[] args) {
        for (int i = 0; i < NBR_ESSAI; i++) {
            String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE);
            System.out.println(motDePasse);
        }
    }
}
