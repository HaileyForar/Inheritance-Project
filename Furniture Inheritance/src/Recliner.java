
public class Recliner extends Chair
{
	String type = "Recliner";
	int weight = 300;
	double price = 199.99;
	
	@Override
	  
	  public void supportsBody()
	  {
		  System.out.println("Extremely Supportive for the entire body!");
	  }
	  
	@Override
	  public void collectsDust()
	  {
		  System.out.println("Who in their right mind would let this collect dust??");
	  }

	@Override
	public void holdsPerson() 
	{
		System.out.println("This chair will cradle you, give you the support you need after a long day at work!");
	}

	@Override
	public void moves() 
	{
		System.out.println("While it doesn't move per say, it sure will prop your feet right up.");
	}
}
