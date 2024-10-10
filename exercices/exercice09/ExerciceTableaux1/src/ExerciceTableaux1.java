


public class ExerciceTableaux1 {
    public static void main(String[] args) {

        String[] alphabet;

        int bro = 0;

         alphabet = new String[7];
        
        alphabet[0] = "A";
        alphabet[1] = "B";
        alphabet[2] = "C";
        alphabet[3] = "D";
        alphabet[4] = "E";
        alphabet[5] = "F";
        alphabet[6] = "G";


        for(bro = 0; bro < 6; bro++) {
            System.out.println(alphabet[bro]);
        }  

        Integer[] numbers = new Integer[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for(bro = 0; bro < 4; bro++) {
            System.out.println(numbers[bro]);
        }

    }
}
