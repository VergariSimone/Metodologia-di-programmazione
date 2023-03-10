import java.util.Random;
public class price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		double price = (generator.nextInt(995) + 1000)/100.0;

		System.out.printf("Price: %.2f \n", price);
	}

}
