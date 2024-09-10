


public class ifSwitch {

    public static void main(String[] args) {
        int note = 6;

        //Test avec if... else if... else
        if (note<4){
            System.out.println("Ma note est insuffisante.");
        }
        else if (note<6){
            System.out.println("Ma note est suffisante mais peut être améliorée.");
        }
        else {
            System.out.println("GG mec.");
        }
      

        System.out.println("Ma note est : " + note);


        //Test avec switch
        switch (note) {
            case 1:
            System.out.println("J'ai fait de la grosse M-");

                break;
            case 2:
            System.out.println("Tu as encore du boulot mon petit"); 

                break;
            case 3: 
            System.out.println("Presque suffisant");
                
                break;
            case 4:
            System.out.println("Bravo tu as réussi... mais pas brillament");   
                break;
            case 5:
             System.err.println("GG, bonne note");   
                break;
            case 6:
            System.out.println("Top 1 Victory royale. Tu les as full box!");    
                break;
            default:
            System.out.println("Note incohérante :)");
                break;
        }
    }
}
