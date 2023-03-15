public class Product {
    
    //attributi
    private String name;    //rappresenta il nome del prodotto
    private double price;  //rappresenta il prezzo del prodotto

    //costruttore
    public  Product(String n, double p){
        name = n;
        price = p;
    }

    /*
     * ritorna il nome del prodotto
     */
    public String getName(){
        return name;
    }


    /*
     * ritona il prezzo del prodotto
     */
    public double getPrice(){
        return price;
    }


    /*
     * riduce il prezzo del prodotto di un ammontare pari 
     * al parametro fornito
     */

     public void reducePrice(double amount){

        price = price - amount;

     }

}
