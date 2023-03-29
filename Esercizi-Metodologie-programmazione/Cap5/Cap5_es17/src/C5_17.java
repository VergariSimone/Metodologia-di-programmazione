import java.util.Scanner;
public class C5_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inseriaci 3 numeri:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("il maggiore è: " + n1);
        }
        else if (n2 > n1 && n2 > n3){
            System.out.println("il maggiore è: " + n2);
        }
        else if (n3 > n1 && n3 > n2){
            System.out.println("il maggiore è: " + n3);
        }
    }
}
