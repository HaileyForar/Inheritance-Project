
public class RockingChair extends Chair
{

	String type = "Rocking Chair";
	int weight = 36;
	double price = 158.06;
	
	@Override
	  
	  public void supportsBody()
	  {
		  System.out.println("Extremely Supportive, especially for you and tiny child.");
	  }
	  
	@Override
	  public void collectsDust()
	  {
		  System.out.println("Sometimes it will collect dust, especially if you don't have young children...or are not a grandmother.");
	  }
	
	@Override
	public void holdsPerson() 
	{
		System.out.println("Can hold up to two (only if one is smaller than loaf of bread).");
	}

	@Override
	public void moves() 
	{
		System.out.println("Will rock back and forth, very helpful for putting both you and your child to sleep.");
	}

}
