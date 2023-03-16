import java.util.Scanner;
import java.lang.Math;
public class C4_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci primo valore: ");
        int valore1 = scanner.nextInt();
        System.out.println("inserisci secondo valore: ");
        int valore2 = scanner.nextInt();
        

        //somma
        int somma = valore1 + valore2;
        System.out.printf("la loro somma è: %8d\n" , somma);

        //differenza 
        int differenza = valore1 - valore2;
        System.out.printf("la loro differenza è: %8d\n" , differenza);

        //prodotto
        int prodotto = valore1 * valore2;
        System.out.printf("il loro prodotto è: %8d\n" , prodotto);

        //media
        double media = (valore1 + valore2) / 2;
        System.out.printf("la loro media è: %11.2f\n" , media);

        //distanza
        int distanza = Math.abs(differenza);
        System.out.printf("la loro distanza è: %8d\n" , distanza);

        //valore minimo
        int minimo = Math.min(valore1, valore2);
        System.out.printf("il volore minimo tra i due numeri è: %8d\n" , minimo);

        // valore massimo 
        int massimo = Math.max(valore1, valore2);
        System.out.printf("il volore massimo tra i due numeri è: %8d\n" , massimo);



    }
}