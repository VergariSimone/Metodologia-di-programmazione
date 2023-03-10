
public class Rectangle {
	
	public double base;
	public double altezza;
	public double perimetro;
	
	public Rectangle() {
		
	}
	
	public void getWidth() {
		
		base = base;
		
	}
	
	public void getHeight() {
		
		altezza = altezza;
		
	}
	
	public void  perimetro (double base, double altezza) {
		perimetro = (base * 2)+ (altezza * 2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rl = new Rectangle();
		rl.perimetro(2,3);
		System.out.println("il perimetro del rettangolo è : " + rl.perimetro);

	}

}
