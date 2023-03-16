import java.lang.Math;

public class Balloon {
    
    // attributi 
    public double volume ;

    //costruttore 
    public Balloon(){
        volume = 0 ;
    }

    //metodi 

    /*
     * aggiunge dell’aria al palloncino per un valore pari a quello
     * passato alla funzione tramite il suo parametro
     */
    public void addAir(double air ){
        volume = volume + air;
    }


    /*
     * ritorna il volume del palloncino 
     */
     public double getVolume (){
        return volume;
     }


     /*
      * ritorna il raggio del palloncino (sfera)
      */
      public double getRadius(){
        return Math.cbrt((3 * volume )/ (Math.PI * 4));
      }

      /*
       * ritorna l'area della superficie del palloncino
       */

       public double getSurfaceArea(){
         return 4 * Math.PI * Math.pow(getRadius(), 2);
       }

       public static void main(String[] args) {
        
        Balloon pallo = new Balloon();
        pallo.addAir(30);
        System.out.println("Volume: " + pallo.getVolume());
        System.out.println("Raggio: " + pallo.getRadius());
        System.out.println("Superficie: " + pallo.getSurfaceArea());
       
       }
}

