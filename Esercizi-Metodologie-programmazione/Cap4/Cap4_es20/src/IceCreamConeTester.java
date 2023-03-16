public class IceCreamConeTester {
    public static void main(String[] args) {
        
        IceCreamCone gelatoCioccolato = new IceCreamCone(6, 1);

        System.out.println("La superficie del cono è: " + gelatoCioccolato.getSurfaceArea());
        System.out.println("il volume del cono è: " + gelatoCioccolato.getVolume());
    }
}
