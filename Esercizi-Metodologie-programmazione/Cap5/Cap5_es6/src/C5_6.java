import java.util.Scanner;
public class C5_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci primo numero");
        double n1 = scanner.nextDouble();
        System.out.println("inserisci secondo numero");
        double n2 = scanner.nextDouble();
        System.out.println("inserisci terzo numero");
        double n3 = scanner.nextDouble();



        if (n1 == n2 && n2 == n3 && n3 == n1){
            System.out.println("i numeri sono tutti uguali");
        }
        else if (n1 != n2 && n2 !=n3 && n3 != n1){
            System.out.println("i numeri sono tutti diversi");
        }
        else {
            System.out.println("due numeri sono uguali ed uno no");
        }
    }
}
