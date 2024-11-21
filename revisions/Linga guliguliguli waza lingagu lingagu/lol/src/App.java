public class App {
    public static String testerPositifOuNegatif(int nombre) {
        if (nombre > 0) {
            return "positif";
        } else if (nombre < 0) {
            return "négatif";
        } else {
            return "nul"; // Si le nombre est zéro
        }
    }
    public class Main {
        public static void main(String[] args) {
            int nombre = -5;
            String resultat = testerPositifOuNegatif(nombre);
            System.out.println("Le nombre " + nombre + " est " + resultat + ".");
        }
    }
}
