import java.util.Scanner;

import javax.swing.LayoutStyle;
public class C5_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci stringa");

        String str ;

        while(!(str = scanner.nextLine()).isEmpty()){
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);

            if (first == last ){

                System.out.println("la prima e l'ultima lettera sono uguali");
    
            }
            else{
                System.out.println("la prima e l'ultima lettera sono differenti");
            }
        }
    }
}
