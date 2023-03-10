
public class Rectangle {
	
	public double base;
	public double altezza;
	public double area;
	
	public Rectangle() {
		
	}
	
	public void getWidth() {
		
		base = base;
		
	}
	
	public void getHeight() {
		
		altezza = altezza;
		
	}
	
	public void  area (double base, double altezza) {
		area = base * altezza;
		
	}
	
	public static void main (String[] args) {
		Rectangle rl = new Rectangle ();
	    rl.area(100,3);
		System.out.println("l'area del rettangolo è: " + rl.area);
		
	}

}
