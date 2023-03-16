import java.lang.Math;
public class IceCreamCone {
    
    //attributi 
    public double height;
    public double radius;

    //costruttore 
    public IceCreamCone(double h, double r ){
        height = h;
        radius = r;

    }

    //metodi


   

    /*
     * ritorna la superficie laterale del cono
     */

     public double getSurfaceArea(){
        double slantHeight = Math.sqrt(radius*radius + height*height);
        return Math.PI * radius * slantHeight;

     }


     /*
      * ritorna il volume del cono 
      */
      public double getVolume(){

        return (Math.PI * radius * radius * height )/ 3;

      }

}
