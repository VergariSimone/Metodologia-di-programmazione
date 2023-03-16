import java.util.Scanner;

public class C4_5 {
    public static void main(String[] args) {

        final double  M_TO_MIGL = 0.000621371 ;
        final double M_TO_FOOTS = 3.28084;
        final double M_TO_PLL = 39.3701;

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci valore in metri: ");
        System.out.println("");
        int valore = scanner.nextInt();


        System.out.println("");

        //stampo conversione miglia piedi pollici
        double MtoMigl = valore*M_TO_MIGL;
        System.out.println("il valore da metri a miglia vale: " + MtoMigl);

        double MtoFoot = valore * M_TO_FOOTS;
        System.out.println("il valore da metri a piedi vale: " + MtoFoot);

        double MtoPll = valore * M_TO_PLL;
        System.out.println("il valore da metri a pollici vale: " + MtoPll);









        
    }
}
