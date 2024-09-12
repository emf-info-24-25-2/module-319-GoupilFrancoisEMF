public class ExerciceCondition4 {
    public static void main(String[] args) {
        int temp = 25;

        if (temp < -10){
            System.out.println("Il fait très froid.");
        } else if (temp >= -10 && temp < 0){
            System.out.println("Il fait froid.");
        } else if (temp >= -10 && temp < 25){
            System.out.println("Il fait normal");
        } else if (temp >= 25 && temp < 35){
            System.out.println("Il fait chaud");
        } else {
            System.out.println("Il fait très chaud");
        }
    }
    
}
