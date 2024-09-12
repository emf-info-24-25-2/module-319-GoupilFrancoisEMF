public class devoir01 {
    public static void main(String[] args) {
        int monAge = 12;

        //Relisez bien la donnée, int n'est pas tout à fait
        //le bon choix pour estMajeur. Il faut une variable 
        //qui permet de stocker si oui ou non la personne est majeure.
        //changez ceci et corrigez la suite de l'exercice
        boolean estMajeur;
        System.out.println("Je m'appel François Goupil");
       
        System.out.println("Mon age est de " + monAge + " ans");

        if (monAge >= 18){
            estMajeur = true;
            System.out.println("Je suis majeur");
        } else {System.out.println("Je ne suis pas encore majeur");
    }
    }
}


