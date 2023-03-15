public class CarTester {
    
    public static void main(String[] args) {
        
        Car Lambo = new Car(1000);
        Lambo.addGas(30);
        Lambo.drive(500);

        double gasLeft = Lambo.getGasInTank();

        System.out.println("Gas Left: " + gasLeft);
    }
}
