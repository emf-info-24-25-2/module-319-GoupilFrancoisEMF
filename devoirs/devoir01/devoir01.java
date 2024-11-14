public class devoir01 {
    public static void main(String[] args) {
        int monAge = 17;
        boolean estMajeur;
        System.out.println("Je m'appel François Goupil");

        System.out.println("Mon age est de " + monAge + " ans");

        if (monAge >= 18) {
            estMajeur = true;
        } else {
            estMajeur = false;
        }
        if (estMajeur == true) {
            System.out.println("Je suis majeur");
        } else {
            System.out.println("Je ne suis pas encore majeur");
        }
    }
}
