
public class operateurLogiques {

    public static void main(String[] args) {
        int opera = 0;
        int opera2 = 2;
        System.out.println((opera == 1) || (opera2 == 1));
        // || (Ou) retourne « true » si au moins une des deux opérandes a et b est vraie.

        System.out.println((opera == 1) && (opera2 == 1));
        // L’opérateur Java && (Et) retourne « true » uniquement si chacune des opérandes a et b sont vraies.

        System.out.println(!(opera == 1) || (opera2 == 1));
        // !  La négation inverse la vérité d’un opérande de « true » à « false » ou vice versa.

        

    }

}
