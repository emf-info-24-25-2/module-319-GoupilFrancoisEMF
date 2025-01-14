import java.util.Scanner;

public class App {

    @SuppressWarnings("resource")
    public String Response() {
        Scanner ready = new Scanner(System.in);
        String response = ready.nextLine();
        switch (response) {
            case "yes":
                return "Aight here we go";

            case "Yes":
                return "Aight here we go";

            case "no":
                return "The fuck you mean no?";

            case "No":
                return "Ah shit here we go again";

            case "yeah":
                return "Alright Bruv";

            default:
                return "You sussy baka";

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the AP brainrot exam !");
        System.out.println("Are you ready ?");
        Ready();

    }
}
