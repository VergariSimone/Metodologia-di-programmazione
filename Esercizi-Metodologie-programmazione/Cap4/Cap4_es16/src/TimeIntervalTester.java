import java.util.Scanner;
public class TimeIntervalTester {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       System.out.println("inserisci primo orario:");
       int t1 = scanner.nextInt();

       System.out.println("inserisci secondo orario:");
       int t2 = scanner.nextInt();

       TimeInterval mytime = new TimeInterval(t1, t2);

       System.out.println(mytime.getHours() + " ore e " + mytime.getMinutes() + " minuti");




        
    }
}
