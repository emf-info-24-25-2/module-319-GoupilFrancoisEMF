package exercices.exercice04;

public class EchangeValeurs {

    public static void main(String[] args) {
        int variable1 = 1;
        int variable2 = 2;
        System.out.println("variabale1=" + variable1);
        System.out.println("variabale2=" + variable2);
        System.out.println("... traitement ...");
        int temp = variable1;
        variable1 = variable2;
        variable2 = temp;
        System.out.println("variable1= " + variable1);
        System.out.println("varuable2= " + variable2);

    }

}
