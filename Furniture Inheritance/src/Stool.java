
public class Stool extends Chair
{
	String type = "Stool";
	int weight = 10;
	double price = 44.00;
	
	@Override
	  
	  public void supportsBody()
	  {
		  System.out.println("Not overly supportive, could cause back problems.");
	  }
	  
	@Override
	  public void collectsDust()
	  {
		  System.out.println("Could collect dust, especially if you do not hold partys very often. Or if you do not like stools.");
	  }

	@Override
	public void holdsPerson() 
	{
		System.out.println("It will hold you, but be careful not to lean too far over. The whole thing might come crashing down!");
	}

	@Override
	public void moves() 
	{
		System.out.println("Does not move...unless you lean too far.");
	}

}
