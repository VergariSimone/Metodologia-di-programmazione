import java.lang.Math;
public class Comparer {
    // attributi 
    private int digits; //indica il numero di cifre decimali utili al calcolo del valore di soglia


    //costruttore
    public Comparer(int dec){

        digits = dec;

    }

    //metodi

    public boolean areSame(double n1, double n2){

       double diff = Math.abs(n1-n2);
       return diff < Math.pow(0.1, digits);
    }
}
