import java.util.Scanner;

public class SimpleTimeDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci ora primo orario:");
        int firstHour = scanner.nextInt();
        System.out.println("inserisci minuti primo orario:");
        int firstMinute = scanner.nextInt();

        SimpleTime timeOne = new SimpleTime(firstHour, firstMinute);


        System.out.println("inserisci ora secondo orario:");
        int secondHour = scanner.nextInt();
        System.out.println("inserisci minuti secondo orario:");
        int secondMinute = scanner.nextInt();

        SimpleTime timeTwo = new SimpleTime(secondHour, secondMinute);

        int compare = timeOne.compareTo(timeTwo);
        if (compare == -1){
            System.out.println("il primo orario precede il secondo");
        }
        else if (compare == 0){
            System.out.println("gli orari sono uguali");
        }
        else{
            System.out.println("il secondo orario precede il primo");
        }

    
        
    }
}
