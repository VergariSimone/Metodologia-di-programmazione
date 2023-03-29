import java.util.Scanner;
public class C5_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci stringa");
        String str = scanner.nextLine();

        String start;
        String last;

        int middle = str.length()/2;

        if (str.length()%2 == 0){
            start = str.substring(0, middle);
            last = str.substring(middle);
        }
        else{
            start = str.substring(0, middle);
            last = str.substring(middle + 1);
        }

        if (start.equals(last)){
            System.out.println("la prima parte e la seconda sono uguali");
        }
        else{
            System.out.println("la prima e seconda parte sono differenti");
        }

    
    }
}
