public class Letter {
    
    //attributi
    private String sender; //mittente lettera
    private String recipient; //destinatario lettera
    private String body; //rappresenta il corpo della lettera 

    //costruttore
    public Letter(String s, String r){
        sender = s;
        recipient = r;
        body = "";
    }

    //metodi 

    /*
     * concatena il contenuto dell’attributo body e 
     * la stringa passata come parametro, andando a capo.
     */
    public void addLine(String newText){

        body = body.concat(newText).concat("\n");

    }


    /*
     * ritorna il contenuto della lettera, 
     * con il seguente formato:
     * 
     * Caro {recipient},
     *  {body}
     * 
     * Tuo, {mittente}
     */
    public String getText(){
        
        return "Cara ".concat(recipient).concat(":\n\n").concat(body)
         .concat("\nCon affetto\n\n").concat(sender);


    }
}
