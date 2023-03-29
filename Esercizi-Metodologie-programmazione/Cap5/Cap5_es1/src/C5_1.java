import java.util.Scanner;
public class C5_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci numero: ");
        int n = scanner.nextInt();
        if (n< 0){
            System.out.println("il numero è negativo");
        }
        else if (n == 0 ){
            System.out.println("il numero è zero");
        }
        else {
            System.out.println("il numero è positivo");
        }

        
    }
}
