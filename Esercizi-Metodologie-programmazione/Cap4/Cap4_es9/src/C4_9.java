import java.util.Scanner;

public class C4_9 {

    /*
     * Creare un programma che stampi a video il costo totale del carburante per un viaggio 
     * in auto di 100 miglia e il numero di miglia massime percorribili con il serbatoio attuale. Per ottenere quanto richiesto,
     *  l’utente dovrà fornire in input:
     * - I litri attuali nel serbatoio
     * - L’efficienza dell’auto (km/litro) 
     * -Il prezzo del carburante per litro
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");

        System.out.printf("inserisci litri attuali nel serbatoio: ");
        double quantitySerbatoio = scanner.nextInt();

        System.out.printf("inserisci l'efficienza dell auto(km/litro): ");
        double efficency = scanner.nextInt();

        System.out.printf("inserisci prezzo del carburante per litro: ");
        double costo = scanner.nextInt();

        double costPer100mil = 100 / efficency * costo;
        double maxDistance = efficency * quantitySerbatoio;

        System.out.println("");

        System.out.printf("per percorrere 100km , costerà $%.2f.\n",costPer100mil);
        System.out.printf("la macchina puo guidare ancora per un massimo di %.2f km \n",maxDistance);
        System.out.println("");
       



        
    }
    
}
