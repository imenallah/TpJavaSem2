
import java.util.Scanner;
public class app1{
    public static int lecture(){
        Scanner scanner= new Scanner(System.in);
        int n;
        do { 
            System.out.println("entrez un entier strictement positive");
            n=scanner.nextInt();
        } while (n<=0);
        return n;
    }
    public static void Somme_rec(int n){
        if (n==0) {
            System.out.println("la somme est 0");
        } else {
            int s=0;
            for (int i = 1; i <= n; i++) {
                s+=i;
            }
            System.out.println("la somme est "+s);
        }

    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=lecture();
        Somme_rec(n);
    }
}