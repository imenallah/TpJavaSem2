
import java.util.Scanner;

  public class MethodeEx2{
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            while (!scanner.hasNextInt()) { // Vérifie que l’entrée est bien un entier
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next(); // Consomme l’entrée invalide
            }
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erreur : L'entier doit être strictement positif.");
            }
        } while (n <= 0);

        return n;
    }
    public static int copmter(int n){
        int nbr=0;
        while(n!=0){
            nbr++;
            n= n / 10;
            
        }return nbr;
    }

}