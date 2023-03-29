import javax.lang.model.util.ElementScanner14;

public class Card {
    
    //attributi 
    private String type; //rappresenta valore della carta
    private String suit; //rappresenta il seme della carta


    //costruttore 
    public Card(String notation){

        int n = notation.length();

        if (n<2){
            type = "?";
            suit = "?";
        }

        else{
            suit = notation.substring(n-1, n);
            type = notation.substring(0,n-1);
        }

    }

    //metodi

    public String getDescription(){
        String output = "";

        if (type.equalsIgnoreCase("A")){
            output = "Ace";
        }
        else if (type.equalsIgnoreCase("K")){
            output = "KIng";
        }
        else if (type.equalsIgnoreCase("Q")){
            output = "Queen";
        }
        else if (type.equalsIgnoreCase("J")){
            output = "Jack";
        }
        
        else if (type.equals("2")){
            output = "two";
        }
        else if (type.equals("3")){
            output = "three";
        }
        else if (type.equals("4")){
            output = "four";
        }
        else if (type.equals("5")){
            output = "five";
        }
        else if (type.equals("6")){
            output = "six";
        }
        else if (type.equals("7")){
            output = "seven";
        }
        else if (type.equals("8")){
            output = "eight";
        }
        else if (type.equals("9")){
            output = "nine";
        }
        else if (type.equals("10")){
            output = "ten";
        }
        else{
            return "Unknown";
        }

        output = output + " of";

        if (suit.equalsIgnoreCase("S")){
            output = output + " spades";
        }
        else if(suit.equalsIgnoreCase("H")){
            output = output + " hearts";
        }
        else if(suit.equalsIgnoreCase("D")){
            output = output + " diamonts";
        }
        else if(suit.equalsIgnoreCase("C")){
            output = output + " clubs";
        }
        else{
            return "Unknown";
        }

        return output;
    }

    public static void main(String[] args) {
        
        Card carta = new Card("QC");
        String text = carta.getDescription();
        System.out.println(text);
    }
}
