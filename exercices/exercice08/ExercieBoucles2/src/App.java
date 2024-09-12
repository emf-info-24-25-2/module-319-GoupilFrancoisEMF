public class App {
    public static void main(String[] args) throws Exception {
        int i = 5;
        System.out.println("Boucle for:");
        for (i = 5; i > 0;){
            System.out.println(i);
            i--;
            if (i == 0){
                System.out.println("Décollage !!!");
            }
        }
        System.out.println("Boucle While:");
        i = 5;
        while(i > 0){
            System.out.println(i);
            i--;
            if (i == 0){
                System.out.println("Décollage !!");
            }
        }
        i = 5;
        System.out.println("Boucle do-while:");
        do { 
            System.out.println(i);
            i--;
            if (i == 0){
                System.out.println("Décollage !!");
            }
        } while (i > 0);

    }
}
