import java.util.Scanner;
import java.lang.Math;

public class C4_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci valore raggio: ");
        double r = scanner.nextInt();

        //area cerchio
        double AreaC = (r * r ) * Math.PI;
        System.out.println("area: " + AreaC);

        //circonferenza cerchio 
        double circC = r * (Math.PI * 2);
        System.out.println("circonferenza: " + circC);

        //volume sfera
        double volSfera = (4 * Math.PI * (r * r * r));
        System.out.println("volume sfera: " + volSfera);

        //superficie sfera
        double superSfera = (4 * Math.PI * (r * r));
        System.out.println("superficie sfera: " + superSfera);






        
    }
    
}
