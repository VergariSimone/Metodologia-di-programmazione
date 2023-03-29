import java.util.Scanner;
public class C5_8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita S per ordine stretto, digita L per senso lato");

        String scelta = scanner.nextLine();


        System.out.println("inserisci 3 numeri");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if(scelta.equals("S")|| scelta.equals("s")){

            if (a < b && a < c){
                if( b < c){
                    System.out.println("increasing");
                }
                else{
                    System.out.println("neither");
                }
            }
            else if (a > b && a > c)
            {
               if (b > c)
               {
                  System.out.println("decreasing");
               }
               else
               {
                  System.out.println("neither");
               }
            }
            else
            {
               System.out.println("neither");
            }
         }
         else
         // Lenient ordering
         {
            if (a == b && a == c && b == c)
            {
               System.out.println("increasing and decreasing");
            }
            else if (a <= b && a <= c)
            {
               if (b <= c)
               {
                  System.out.println("increasing");
               }
               else
               {
                  System.out.println("neither");
               }
            }
            else if (a >= b && a >= c)
            {
               if (b >= c)
               {
                  System.out.println("decreasing");
               }
               else
               {
                  System.out.println("neither");
               }
            }
            else
            {
               System.out.println("neither");
            }
         }
   
      }

        }

        
    

