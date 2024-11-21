public class App {
    public static final int PRIX_CATEGORIE_UN = 25;
    public static final int PRIX_CATEGORIE_DEUX = 18;
    public static final int PRIX_CATEGORIE_TROIS = 12;
    public static final int[] CATEGORIE_SALLE = {3,3,2,2,1,1,2,2,3,3};
    
    public static int afficherTarifs(String prix_categorie_un, String prix_categorie_deux, String prix_categorie_trois) {
        prix_categorie_un = "25";
        prix_categorie_deux = "18";
        prix_categorie_trois = "12";
        
    }
    public static void main(String[] args) {
        System.out.println(afficherTarifs());
    } //je doit revoir les méthodes car ça m'a coincé
}
