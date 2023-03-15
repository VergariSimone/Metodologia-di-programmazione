public class Rectangle {
    
    // attributi 
    private double altezza;
    private double base;

    // costruttore 
    public Rectangle(double h, double b){

        altezza = h;
        base = b;

    }

    //metodi

    /*
     * che prende come parametri due nuovi valori di base e altezza e aggiorna lo stato
     */
    public void ridimenasiona(double newH, double newB){

        altezza = newH;
        base = newB;

    }

    /*
     * che restituisce il perimetro
     */

     public double perimetro(){

        return base*2 + altezza*2;
     }


     /*
      * che restituisce l'area 
      */
      public double area(){
        return altezza * base;
      }


      /*
       * return la base del rettangolo
       */
      public double getBase(){
        return base;
    }


    /*
     * return l'altezza del rettangolo
     */
    public double getAltezza(){
        return altezza;
    }
}
