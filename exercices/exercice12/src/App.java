public class App {
    public static void main(String[] args) throws Exception {
        String nomChaineDeCharactere = "Voici du contenu stocké dans un String."                        ;

        String  monPrenom = "François";
        
        System.out.println("Voici le nombre de caractères contenz dans la variable " + nomChaineDeCharactere.length());

        System.out.println("le texte (Contenu) commence a la position " + nomChaineDeCharactere.indexOf("Contenu") + "Du texte");

        System.out.println("La position 10 contient la lettre : " + nomChaineDeCharactere.charAt(10));

        for(int i = 0; i < monPrenom.length(); i++){
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }

        if(monPrenom.contains("test")){
            System.out.println("La chaine de caractères \"" + monPrenom + "\" contient le texte \"test\".");
        } else {
            System.out.println("La chaine de caractères \"" + monPrenom + "\" ne contient pas le \"texte\".");
        }
    }
}
