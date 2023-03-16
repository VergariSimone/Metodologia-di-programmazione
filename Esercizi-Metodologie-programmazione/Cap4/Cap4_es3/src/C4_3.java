import java.util.Scanner;
import java.lang.Math;

public class C4_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci primo valore: ");
        int valore1 = scanner.nextInt();
        System.out.println("inserisci secondo valore: ");
        int valore2 = scanner.nextInt();
        

        //somma
        int somma = valore1 + valore2;
        System.out.println("la loro somma è: " + somma);

        //differenza 
        int differenza = valore1 - valore2;
        System.out.println("la loro differenza è: " + differenza);

        //prodotto
        int prodotto = valore1 * valore2;
        System.out.println("il loro prodotto è: " + prodotto);

        //media
        int media = (valore1 + valore2) / 2;
        System.out.println("la loro media è: " + media);

        //distanza
        int distanza = Math.abs(valore1);
        System.out.println("la loro distanza è: " + distanza);

        //valore minimo
        int minimo = Math.min(valore1, valore2);
        System.out.println("il volore minimo tra i due numeri è: " + minimo);

        // valore massimo 
        int massimo = Math.max(valore1, valore2);
        System.out.println("il volore massimo tra i due numeri è: " + massimo);







        
    }
}
