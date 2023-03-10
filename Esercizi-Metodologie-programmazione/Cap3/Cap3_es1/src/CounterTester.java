
public class CounterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Counter tally = new Counter();
	      tally.click();
	      tally.click();
	      tally.click();
	      System.out.println(tally.getValue());
	      System.out.println("Expected: 3");
	      tally.undo();
	      System.out.println(tally.getValue());
	      System.out.println("Expected: 2");
	      tally.undo();
	      tally.undo();
	      tally.undo();
	      System.out.println(tally.getValue());
	      System.out.println("Expected: 0");
	}

}
