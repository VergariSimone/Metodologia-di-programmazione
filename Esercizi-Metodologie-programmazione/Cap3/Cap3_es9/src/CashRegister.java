public class CashRegister {

    //attributi 
    /*
     * contiene l’importo totale dei prodotti 
     * che si vogliono acquistare
     */
    private double purchase;

    /*
     * contiene l’importo ricevuto dall’acquirente per
     *  il pagamento dei prodotti
     */
    private double payment;

    /*
     * rappresenta lo scontrino con al suo interno 
     * i prezzi dei prodotti acquistati
     */
    private String history;


    //costruttore
    public CashRegister()
    {
       purchase = 0;
       payment = 0;
       history = "";
    }
 

    //metodi

    /*
     * registra la vendita di un prodotto, ricevendo in 
     * input un parametro che indichi il prezzo del 
     * prodotto che acquistato. Tale funzione dovrà 
     * aggiornare l’importo totale dei prodotti 
     * acquistati, aggiornando lo scontrino con 
     * l’aggiunta di una nuova riga che contiene 
     * il prezzo del prodotto appena scelto
     */
    public void  recordPurchase(double amount){
        purchase = purchase + amount;
        history = history + String.valueOf(amount) + " $"+ "\n";
    }

    /*
     * simula il passaggio di denaro tra acquirente
     *  e venditore, aggiornando l’attributo relativo 
     * agli importi ricevuti
     */
    public void receivePayment(double amount){
         payment = payment + amount;
    }

    /*
     * simula il calcolo del resto, ossia la differenza 
     * tra i soldi forniti dall’acquirente per il 
     * pagamento e l’importo totale. Una volta calcolato
     *  il resto, il contenuto dello scontrino e 
     * i due totali dovranno essere azzerati. 
     * Il resto dovrà essere ritornato dalla funzione 
     * come output.
     */
    public double giveChange (){

    double change = payment - purchase;
    purchase = 0; 
    payment = 0 ;
    history = "";
    return change;
    }


    /*
     * stampa il contenuto dello scontrino e, 
     * successivamente, il totale dei prodotti 
     * acquistati.
     */
    public void printReceipt(){

        System.out.println(history);
        System.out.println("Total: " + String.valueOf(purchase) + " $");

    }

}
