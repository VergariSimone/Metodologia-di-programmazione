import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.lang.Math;

public class C5_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero in virgola mobile doppia precisione: ");
        double n = scanner.nextDouble();
        String abs = "";
        if (Math.abs(n) < 1.0){
            abs = "small";
        }
        if (Math.abs(n) > 100000.0){
            abs = "large";
        }
        if (n == 0){
            System.out.println("è zero");
        }
        else if ( n > 0){
            System.out.println("è " + abs + " numero positivo");
        }
        else{
            System.out.println("è " + abs + " numero negativo");
        }

    }
}
