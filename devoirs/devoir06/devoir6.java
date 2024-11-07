public class devoir6{
    
    public static final int TAILLE_TABLEAU=20;

    public static final int VALEUR_MAX=50;

    public static final int VALEUR_MIN=0;

    public static final int VALEUR_RECHERCHEE=7;

    public static int[] genereTableau(int VALEUR_MIN, int VALEUR_MAX, int TAILLE_TABLEAU) {
        int[] tableau = new int[TAILLE_TABLEAU];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int)(Math.random()*(VALEUR_MAX - VALEUR_MIN + 1) + VALEUR_MIN);
            System.out.println(tableau[i]);
        }
                return tableau;
    }
    public static void main(String[] args) {
            System.out.println(genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU));
        
    }
}