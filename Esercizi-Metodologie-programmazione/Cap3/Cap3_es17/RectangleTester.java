public class RectangleTester {
    
    public static void main(String[] args) {
        Rectangle rett1 = new Rectangle(3,5);
        Rectangle rett2 = new Rectangle(5,5);
        Rectangle rett3 = new Rectangle(7,5);

        // somma aree
        double sommaAree = rett1.area() + rett2.area() + rett3.area();
        System.out.println("La somma delle aree è: " + sommaAree);

        //somma perimetri 
        double sommaPerimetri = rett1.perimetro() + rett2.perimetro() + rett3.perimetro();
        System.out.println("La somma dei perimetri  è: " + sommaPerimetri);

        rett1.ridimenasiona(2,2);
        System.out.println("" );


        System.out.println("Parametri aggiornati dopo il ridimensionamento di un rettangolo:" );
        System.out.println("" );

        System.out.println("altezza: " + rett1.getAltezza());
        System.out.println("base: " + rett1.getBase());

    }
}
