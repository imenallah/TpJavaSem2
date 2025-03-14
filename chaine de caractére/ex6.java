import java.util.Scanner;

public class ex6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String mot;
        int e1=0,y1=0,a1=0,o1=0,u1=0,i1=0;
        System.out.println("donner un mot");
        mot=sc.nextLine();
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i)=='e') {
                e1++;
            }
            if (mot.charAt(i)=='y') {
                y1++;
            }
            if (mot.charAt(i)=='a') {
                a1++;
            }
            if (mot.charAt(i)=='o') {
                o1++;
            }
            if (mot.charAt(i)=='u') {
                u1++;
            }
            if (mot.charAt(i)=='i') {
                i1++;
            }
        }
        System.out.println(a1+" fois de la lettre a  \n"+y1+" fois de la lettre y  \n"+e1+" fois de la lettre e  \n"+u1+" fois de la lettre u  \n"+o1+" fois de la lettre o  \n"+i1+" fois de la lettre i \n");



    }
}