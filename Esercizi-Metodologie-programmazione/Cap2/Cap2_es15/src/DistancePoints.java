import java.awt.Point;
public class DistancePoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point(3,4);
		Point p2 = new Point(-3,-4);
		
		double distanza = p1.distance(p2);
		
		System.out.println("la distanza tra i due punti è: " + distanza);
		
		
	}

}
