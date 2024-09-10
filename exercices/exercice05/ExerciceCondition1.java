package exercices.exercice05;
import java.util.Scanner;
public class ExerciceCondition1 {

    public static void main(String[] args) {

        Scanner askForValue = new Scanner(System.in);
        System.out.println("Entrez votre chiffre");
        int  valeurATester = askForValue.nextInt();
        if (valeurATester > 0) {
            System.out.println(valeurATester + " est un nombre positif"); 
        }else if (valeurATester < 0) {
            System.out.println(valeurATester + " est un nombre négatif"); 
        }else {
            System.out.println(valeurATester + " n'est ni positif ni négatif");
        }
    }

}
