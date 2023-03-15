public class Bug {
    
    //attributi
    private int position;   //posizione dell'insetto
    private int direction;  //rappresenta la direzione dell’insetto, che può essere pari a 1 (insetto che si muove in avanti) o -1 (insetto che si muove all’indietro)


    //costruttore 
    public Bug(int posInitial ){

        position = posInitial;
        direction = 1;


    }

    //metodi

    /*
     * muove l'insetto , modificando la sua posizione in base al valore della posizione 
     */
    public void move(){
        position = position + direction;
    }


    /*
     * cambia direzione 
     */
     public void turn(){

        direction = -direction;

     }


     /*
      * ritorna il valore corrente della posizione 
      */
      public int GetPosition(){

        return position ;

      }


}
