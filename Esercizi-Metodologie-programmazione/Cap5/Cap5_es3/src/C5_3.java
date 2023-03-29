import java.util.Scanner;
public class C5_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci numero: ");
        Long  l = scanner.nextLong();
        int cifre ;
        if (l<0){
            l = -l;
        }
        
        if (l > 999999999){
            cifre = 10;
        }
        else if (l > 99999999){
            cifre = 9;
        }
        else if (l > 9999999){
            cifre = 8;
        }
        else if (l > 999999){
            cifre = 7;
        }
        else if (l > 99999){
            cifre = 6;
        }
        else if (l > 9999){
            cifre = 5;
        }
        else if (l > 999){
            cifre = 4;
        }
        else if (l > 99){
            cifre = 3;
        }
        else if (l > 9){
            cifre = 2;
        }
        else{
            cifre = 1;
        }

        System.out.println("il numero " + l + " ha " + cifre + " cifre");

    }
}
