import java.util.Scanner;
public class ex1{
    public static double Somme( double[] tab){
        double s=0;
        for (int i = 0; i < tab.length; i++) {
            s+=tab[i];
        }return s;
    }
    public static void RemplirTab(double[] tab){
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("T["+i+"]=");
            tab[i]=scanner.nextInt();  
        }
    }

    public static void Incre(double[] tab, double x){
        for (int i = 0; i < tab.length; i++) {
            tab[i]= tab[i] + x;
        }
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Donner la taille du tableau : ");
    int n = scanner.nextInt();
    
    double[] tab = new double[n];
    
    RemplirTab(tab);
    
    double sommeInitiale = Somme(tab);
    System.out.println("Somme initiale des éléments du tableau : " + sommeInitiale);
    
    System.out.print("Donner la valeur à ajouter à chaque élément : ");
    double x = scanner.nextDouble();
    
    Incre(tab, x);
    
    System.out.println("Tableau après incrémentation : ");
    for (int i = 0; i < tab.length; i++) {
        System.out.println("T[" + i + "] = " + tab[i]);
    }
    
    double nouvelleSomme = Somme(tab);
    System.out.println("Nouvelle somme après incrémentation : " + nouvelleSomme);
}
        
}
