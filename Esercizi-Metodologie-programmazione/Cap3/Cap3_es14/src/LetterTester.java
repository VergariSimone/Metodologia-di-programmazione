public class LetterTester {
    
    public static void main(String[] args) {
        
        Letter ciao = new Letter("Simone", "Francesca");


        ciao.addLine(" Salve egregia signorina Francesca D'anna \n PS.non so se effettivamente si scrive cosi il tuo cognome,\n ma in ogni caso le abbiamo scritto per riferle \n che se ne puo andare a fare in culo <3 ");

        System.out.println("");
        System.out.println("");

        System.out.println("Mail: \n \n " + ciao.getText());

    }
}
