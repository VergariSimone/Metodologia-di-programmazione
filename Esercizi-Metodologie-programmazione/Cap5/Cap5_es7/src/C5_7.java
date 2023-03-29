import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class C5_7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("inserisci primo numero");
        double n1 = scanner.nextDouble();
        System.out.println("inserisci secondo numero");
        double n2 = scanner.nextDouble();
        System.out.println("inserisci terzo numero");
        double n3 = scanner.nextDouble();

        if (n1 > n2 && n2 > n3){
            System.out.println("la serie è decrescente");
        }
        else if (n1 < n2 && n2 < n3){
            System.out.println("la serie è crescente");
        }
        else{
            System.out.println("la serie è mista");
        }

    }


}
