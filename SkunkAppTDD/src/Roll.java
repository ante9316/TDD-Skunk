
public class Roll {

	private int lastTotal;
	
	public Roll()
	{
		lastTotal = rollDie()+rollDie();

	}

	private int rollDie() {
		
		return (int) Math.random()*6+1;
	}

	public int getLastTotal() {			
		return lastTotal;
	}

	public int isSkunkRolled() 
	{
		while(rollDie()==1)
		{
			if(rollDie()==1)
			{
				return 0;
			}
		}
		return lastTotal;
		
	}

}
