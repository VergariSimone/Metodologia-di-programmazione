
public class Moth {

    //attributi
    private double position;  // rappresenta la posizione della libellula 


    //costruttore 
    public Moth( double posInitianl){
        position = posInitianl;
    }

    //metodi

    /*
     * muove la libellula verso la posizione della fonte di luce , fornita come parametro. 
     * La nuova posizione della libellula coinciderà con la metà della distanza tra posizione attuale e quella della fonte di luce
     */

     public void  moveToLight(double positionLight){

        position = (position + positionLight) / 2;

     }


     /* 
      * ritorna la posizione attuale della libellula
      */

      public double getPosition(){
    
        return position;

      }




    

}
