import java.util.Scanner;
import java.lang.Math;

public class C4_2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un valore :");
        int valore = scanner.nextInt();

        System.out.println("il valore elevato alla 2 è: " + Math.pow(valore, 2)); 
        System.out.println("il valore elevato alla 3 è: " + Math.pow(valore, 3)); 
        System.out.println("il valore elevato alla 4 è: " + Math.pow(valore, 4)); 

    }
}
