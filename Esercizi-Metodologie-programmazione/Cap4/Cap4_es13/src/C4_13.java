import java.util.Scanner;
public class C4_13 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("inserisci valore:");
        String n = scanner.next();

        String prefix = n.substring(0, n.length() - 3);
        String postfix = n.substring(n.length() - 3, n.length());

        String unityFloat = prefix + "," + postfix;
        System.out.println(unityFloat);
    }
    
}
