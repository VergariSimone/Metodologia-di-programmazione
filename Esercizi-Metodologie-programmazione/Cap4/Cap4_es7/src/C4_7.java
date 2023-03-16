import java.util.Scanner;
import java.lang.Math;
public class C4_7 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci base: ");
        double base = scanner.nextInt();

        System.out.println("inserisic altezza: ");
        double altezza = scanner.nextInt();

        //area
        double area = base * altezza;
        System.out.println("l'area del rettangolo è: " + area);

        //perimetro
        double perimetro = (base + altezza) * 2 ;
        System.out.println("il perimetro del rettangolo è: " + perimetro);

        //diagonale 
        double diagonale = Math.sqrt(Math.pow(base,2 ) + Math.pow(altezza, 2));
        System.out.println("la diagonale del rettangolo è: " + diagonale);
        
    }
}
