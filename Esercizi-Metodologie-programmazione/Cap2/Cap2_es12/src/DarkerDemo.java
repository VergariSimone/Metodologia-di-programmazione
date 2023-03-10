import java.awt.Color;
public class DarkerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Color color1 = Color.RED.darker();
		Color c2 = color1.darker();

		
	      System.out.print("Red: ");
	      System.out.println(c2.getRed());
	      System.out.print("Green: ");
	      System.out.println(c2.getGreen());
	      System.out.print("Blue: ");
	      System.out.println(c2.getBlue());
		
		
	}

}
