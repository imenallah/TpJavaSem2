import java.util.Scanner;

  public class MethodeEx3{
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
    public static int calculeSomme(int n){
        int s=0;
        int i;
            for ( i = 1; i <= n; i++) {
                s=s+i*i;   
            }
        return s;
    }

}