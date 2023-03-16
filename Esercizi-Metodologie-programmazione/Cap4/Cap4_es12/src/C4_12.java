import java.util.Scanner;
public class C4_12 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero tra 1,000 e 999,999: ");
        String n = scanner.next();

        String prefix = n.substring(0, n.length() - 4);
        String postfix = n.substring(n.length() - 3, n.length());

        System.out.println(prefix + postfix);


    }
}
