public class MenuTester {
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        
        menu.addOption("Simone");
        menu.addOption("Raul");
        menu.addOption("Franco");
        menu.addOption("Federico");
        System.out.println("");
        System.out.println("Le opzioni sono le seguenti:");

        System.out.println(menu.display());



    }
}
