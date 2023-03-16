import java.util.Scanner;

public class C4_11 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        
        System.out.println("inserire lettera del drive dove salvare il file:");
        String lDrive = scanner.nextLine();

        System.out.println("");

        System.out.println("inserisci il percorso all'interno del drive che porti alla cartella desiderata: ");
        String percorso = scanner.nextLine();

        System.out.println("");

        System.out.println("inserisci nome del file: ");
        String nameFile = scanner.nextLine();

        System.out.println("");

        System.out.println("inserisci estensione file: ");
        String extetion = scanner.nextLine();

        System.out.println(""); 
        System.out.println("");

        System.out.println(lDrive + ":" + percorso + "//" + nameFile +"." + extetion);
        
    }
}
