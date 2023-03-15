public class Car {
    
    // attribuiti

    /*
     * rappresenta i litri di carburante rimanente
     */
    private double gas;


    /*
     * rappresenta il numero di km per litro 
     * che la macchina può fare
     */
    private double efficiency;


    //costruttore 
    public Car(double anEfficiency){
        gas = 0;
        efficiency = anEfficiency;
    }


    //metodi
    /*
     * incrementa l’attributo gas di un valore pari a 
     * quello del parametro passato al metodo
     */
     public void addGas(double amount){
        gas = gas + amount;
     }


     /*
      * simula un viaggio in auto di una distanza pari
      * a quella del parametro passato alla funzione. 
      * In virtù di ciò, il carburante dovrà essere 
      *diminuito in base all’efficienza dell’automobile.
      */
      public void drive (double distance){
        gas = gas - efficiency / distance;
      }


      /*
       * ritorna l’ammontare di carburante residuo
       */
       public double getGasInTank(){
        return gas;
       }

}
