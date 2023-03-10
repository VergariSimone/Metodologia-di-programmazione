
public class RangeInput {
	
	public int min ;
	public int max;
	public int current = 5 ;
	
	
	
	//da finire non riesco
	public RangeInput(int min, int max){
		
		
		min = min ;
		max = max;
		current = (min + max) / 2;
		
	}
	
	public int getCurrent() {
		return current;
	}
	
	
	public void up() {
		
		if (current< max) {
			 current += 1 ;
		}
		
		
	}
	
	public void down() {
		if ( current >= min)
		{
			 current -= 1;
		}
		
	}

}
