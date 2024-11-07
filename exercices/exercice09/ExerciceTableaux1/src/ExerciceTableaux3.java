public class ExerciceTableaux3 {
    public static void main(String[] args) {

        int n = 10;
        int[] cellules = new int[n];

        for(int i = 0; i < n; i++) { 
            int s = (int)(Math.random() * (6 - 1 + 1) ) + 1;
            cellules[i] = s; 
            System.out.println("Note " + i + ": " + s);
        }
        
     }
}
