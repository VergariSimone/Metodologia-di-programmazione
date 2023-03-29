import java.util.Scanner;

public class C5_11 {
    public static void main(String[] args) {

        final double NE = 22.5;
        final double E = NE + 45; 
        final double SE = E + 45; 
        final double S = SE + 45;
        final double SW = S + 45; 
        final double W = SW + 45; 
        final double NW = W + 45; 
        final double N = NW + 45;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci valore corrente bussola: ");
        float n = scanner.nextFloat();

        if(n <= NE)
      {   // The part of N between 0 and 22.5 n
         System.out.println("North");
      }
      else if(n < E)
      {
         System.out.println("North East");
      }
      else if(n <= SE)
      {
         System.out.println("East");
      }
      else if(n < S)
      {
         System.out.println("South East");
      }
      else if(n <= SW)
      {
         System.out.println("South");
      }
      else if(n < W)
      {
         System.out.println("South West");
      }
      else if(n <= NW)
      {
         System.out.println("West");
      }
      else if(n < N)
      {
         System.out.println("North West");
      }
      else
      {
         // The part of N between 337.5 and 360 n
         System.out.println("North");
      }
   }

    }

