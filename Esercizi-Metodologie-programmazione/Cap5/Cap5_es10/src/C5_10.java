import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class C5_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("inserisci 4 valori");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();


        if (a == b && c == d){
            System.out.println("i numeri sono uguali a coppie ");
        }
        else if ( a == c && b == d){
            System.out.println("i numeri sono uguali a coppie ");
        }
        else if(a == d && b == c){
            System.out.println("i numeri sono uguali a coppie ");
        }
        else{
            System.out.println("i numeri non sono uguali a coppie");
        }
        
    }
}
