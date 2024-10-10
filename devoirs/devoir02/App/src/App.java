import java.util.Random;

public class App {
    private static final int CAPACITE_RESERVOIR_A = 3;
    private static final int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;

        Random rand = new Random();

        int remplissage = rand.nextInt(CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B + 1);

        System.out.println("Nombre de litres à remplir: " + remplissage);

        while (reservoirA + reservoirB < remplissage) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                int quantiteAAjouter = Math.min(CAPACITE_RESERVOIR_A - reservoirA, remplissage - (reservoirA + reservoirB));
                reservoirA += quantiteAAjouter;
                System.out.println("Remplissage du réservoir A: " + reservoirA + " litres");
            }

            if (reservoirA + reservoirB < remplissage && reservoirB < CAPACITE_RESERVOIR_B) {
                int quantiteAAjouter = Math.min(CAPACITE_RESERVOIR_B - reservoirB, remplissage - (reservoirA + reservoirB));
                reservoirB += quantiteAAjouter;
                System.out.println("Remplissage du réservoir B: " + reservoirB + " litres");
            }
        }

        System.out.println("Niveau final du réservoir A: " + reservoirA + " litres");
        System.out.println("Niveau final du réservoir B: " + reservoirB + " litres");
    }
}
