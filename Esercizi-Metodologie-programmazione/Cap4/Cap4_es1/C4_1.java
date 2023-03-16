import java.lang.Math;
public class C4_1 {
    public static void main(String[] args) {
        
        final double CM_TO_MM = 25.4;
        double height = 11 * CM_TO_MM;
        double width = 8.5 * CM_TO_MM;

        //stampa altezza
        System.out.printf("altezza: %5.2f mm\n " , height );

        //stampa larghezza 
        System.out.printf("larghezza: %5.2f mm\n" , width );

        //stampa perimetro
        double perimetro = (height + width) * 2;
        System.out.printf("il perimetro è: %5.2f mm\n" , perimetro );

        //stampa diagonale
        double diagonale = Math.sqrt(height*height + width * width);
        System.out.printf("la diagonale è: %5.2f mm\n " , diagonale);


    }
    
}
