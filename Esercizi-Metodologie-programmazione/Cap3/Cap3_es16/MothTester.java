
public class MothTester {
     public static void main(String[] args) {
        
        Moth libellula = new Moth(10);
        System.out.println("");
        System.out.println("");
        libellula.moveToLight(0);
        System.out.println(libellula.getPosition());

        System.out.println("");
        libellula.moveToLight(10);
        System.out.println(libellula.getPosition());

        System.out.println("");
        libellula.moveToLight(0);
        System.out.println(libellula.getPosition());
        System.out.println("");

     }
}
