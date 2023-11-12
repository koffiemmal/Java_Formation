import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner clavier = new Scanner(System.in);

        System.out.println("entrer votre mot de passe");

       String motDePasse = clavier.nextLine();

       switch (motDePasse){
           case "admin" -> System.out.println("vous etes admin");
           case "user" -> System.out.println("vous etes utilisateur");
           default -> System.out.println("vous n'etes ni admin ni user");
       }
    }
}