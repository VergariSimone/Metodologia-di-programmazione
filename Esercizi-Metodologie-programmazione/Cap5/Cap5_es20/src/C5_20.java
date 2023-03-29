import java.util.Scanner;

public class C5_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un carattere alfabetico");
        String word = scanner.nextLine();

        if(word.length() == 1){
            char c = word.charAt(0);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                  || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                  || c == 'O' || c == 'O' || c == 'U')
                  {
                    System.out.print("Vocale");
                  }
                  else{
                    System.out.println("Consonante");
                  }
            }
            else{
                System.out.println("Error: non è un carattere alfanumerico");
            }

        }

        else{
            System.out.println("Error: troppo lungo");
        }

        
        
    }
}
