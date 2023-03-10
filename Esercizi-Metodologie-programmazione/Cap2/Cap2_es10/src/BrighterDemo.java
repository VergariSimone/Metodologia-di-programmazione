import java.awt.Color;

public class BrighterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Color c = new Color(50, 100, 150);
	     Color brighterColor = c.brighter();

	      System.out.print("Red: ");
	      System.out.println(brighterColor.getRed());
	      System.out.print("Green: ");
	      System.out.println(brighterColor.getGreen());
	      System.out.print("Blue: ");
	      System.out.println(brighterColor.getBlue());

	}

}
