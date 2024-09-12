public class App {
    public static void main(String[] args) throws Exception {
        int i = 1;
        for (i = 1; i < 6; i++) {
            System.out.println(i);
        }
        i = 1;
        while (i < 6 ){
            System.out.println(i);
            i++; 
        }
        i = 1;
        do {
            System.err.println(i);
            i++;
        } while(i < 6);
    }
}
