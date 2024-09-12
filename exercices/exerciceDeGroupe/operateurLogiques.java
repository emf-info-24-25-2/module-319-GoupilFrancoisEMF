
public class operateurLogiques {

    public static void main(String[] args) {
        int opera = 0;
        int opera2 = 2;
        System.out.println((opera == 0) || (opera2 == 1));
        // || (Ou) retourne « true » si au moins une des deux opérandes a et b est vraie.

        System.out.println((opera == 0) && (opera2 == 1));
        // L’opérateur Java && (Et) retourne « true » uniquement si chacune des opérandes a et b sont vraies.

        System.out.println(!(opera == 0) || (opera2 == 1));
        // !  La négation inverse la vérité d’un opérande de « true » à « false » ou vice versa.

        System.out.println((opera == 0) ^ (opera2 == 1));
        //^	Exor retourne « true » uniquement si exactement une des deux opérandes a et b est vraie.

        

    }

}
