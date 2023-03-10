import java.awt.Rectangle;
public class coordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rl = new Rectangle(5, 10, 20, 30);
		
		//edit the coordinate in x = 0, y = 0
		rl.add(0,0);
		
	System.out.println("La coordinata x è : "+ rl.getX());
	System.out.println("La coordinata y è : "+ rl.getY());
	System.out.println("L' altezza è : " + rl.getHeight());
	System.out.println("La base è : "+ rl.getWidth() );
	
		
		
	}

}
