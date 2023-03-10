
public class LoadBar {

	public double percentage;
	
	public LoadBar(double percentage) {
		this.percentage = percentage;
	}
	
	
	public void increment(double percentage) {
		this.percentage += percentage;
	}
	
	public String toString() {
		return Math.round(percentage)+"%";
	}
	
	public static void main (String[] args) {
		LoadBar lb = new LoadBar(0);
		lb.increment(13.7);
		System.out.println(lb.toString());
	}
}
