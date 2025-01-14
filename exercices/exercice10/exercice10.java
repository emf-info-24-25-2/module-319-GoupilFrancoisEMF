public class exercice10{
    public void direBojnour() {
        System.out.println("Bonjour");
    }
    public static void dire(String lol) {
        lol = "cool";
        System.out.println(lol);
    }
    public static void Math() {
        //Min slects the smallest value
        System.out.println(Math.min(1, 10));

        //Max selects the highest value for example: what's bigger 1 or 3 ? 3... so the value of Math.max will be 3
        System.out.println(Math.max(1, 3));

        //Pow all it does is puts the first number x(10) to the power of y(2) or you could add more exponants
        System.out.println(Math.pow(10, 2));

        //Sqrt"it's the square root of x(2)
        System.out.println(Math.sqrt(2));

        //Abs it calculates the absolute value of a number
        System.out.println(Math.abs(10.9999999999999999));

        
    }
    public static void main(String[] args) {
        Math();
    }
}