
public class Circuit {

	private int firstSwitch ;  // 0 = down, 1 = up
	private int secondSwitch;
	private int lampState;    // 0 = on , 1 = off
	
	
	
	
	public int getFirstSwitchState()
	{
	    return firstSwitch;
	}

	
	
	public int getSecondSwitchState() 
	{
		return secondSwitch;
	}
	
	public int getLampState() {
		return lampState;
	}
	
	public void toggleFirstSwitch()
    {
        firstSwitch = (firstSwitch + 1) % 2;
        lampState = (lampState + 1) % 2;
    }
	
	 public void toggleSecondSwitch()
	    {
	        secondSwitch = (secondSwitch + 1) % 2;
	        lampState = (lampState + 1) % 2;
	    }
	 
	 
	
	
}

