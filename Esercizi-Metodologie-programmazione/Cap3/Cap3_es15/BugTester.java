public class BugTester {
    
    public static void main(String[] args) {

        Bug scorpione = new Bug(10);

        //si muove due volte 
        scorpione.move();
        scorpione.move();

        //cambia direzione 
        scorpione.turn();

        //si muove nuovamente
        scorpione.move();
        System.out.println("");
        System.out.println("");
        System.out.println("l'insetto si trova in posizione: " + scorpione.GetPosition());
        System.out.println("");
        System.out.println("");

    }
}
