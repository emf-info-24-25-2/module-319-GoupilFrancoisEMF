public class MonteCarloPI {
    static final double NBRE_ESSAIS = 1000000000;
    public static void main(String[] args) {
        int pointsDansZoneVerte = 0;

        for (int i = 0; i < NBRE_ESSAIS; i++) {
            double x = Math.random();
            double y = Math.random();

            double distance = Math.sqrt(x * x + y * y);

            if (distance <= 1) {
                pointsDansZoneVerte++;
            }
        }

        double piEstimation = 4.0 * pointsDansZoneVerte / NBRE_ESSAIS;

        System.out.println("pi =~ " + piEstimation);
    }
}