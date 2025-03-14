
public class ex1 {
      
    public static void main(String[] args) {
        int[] entiers = new int[10]; // Tableau pour stocker les 10 entiers

        // Lecture des 10 entiers
        System.out.println("Veuillez entrer 10 entiers strictement positifs :");
        for (int i = 0; i < 10; i++) {
            entiers[i] = Methode.lectureN();
        }

        // Affichage des entiers pairs
        System.out.println("\nLes entiers pairs sont : ");
        for (int n : entiers) {
            if (Methode.EstPair(n)) {
                System.out.print(n + " ");
            }
        }
    }
}
