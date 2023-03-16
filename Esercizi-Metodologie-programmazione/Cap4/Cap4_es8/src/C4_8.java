import java.util.Scanner;
public class C4_8 {
    public static void main(String[] args) {

        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci bill value:(1 = $1 bill, 5 = $5 bill, etc.) ");
        int billValue = scanner.nextInt();

        System.out.println("inserisci quarter value: (1 = $.25, 2 = $.50, etc.)");
        int quarterValue = scanner.nextInt();

        System.out.println("inserisci prezzo dell'oggetto in penny:");
        int itemPrice = scanner.nextInt();

        int amountDue = PENNIES_PER_DOLLAR * billValue + PENNIES_PER_QUARTER * quarterValue -itemPrice;

        System.out.printf("Amount due (in pennies):     %d\n", amountDue);
        int dollarCoins = amountDue / PENNIES_PER_DOLLAR;
        amountDue = amountDue % PENNIES_PER_DOLLAR;
        int quarters = amountDue / PENNIES_PER_QUARTER;
  
        System.out.printf("Dollar coins: %d\n", dollarCoins);
        System.out.printf("Quarters:     %d\n", quarters);

        
    
    }
}
