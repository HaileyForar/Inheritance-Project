
public class Futon extends Bed 
{

	String type = "Futon";
	int weight = 55;
	double price = 445.99;
	
	@Override
	  
	  public void supportsBody()
	  {
		  System.out.println("Extremely Supportive...if you have no feeling in your back.");
	  }
	  
	@Override
	  public void collectsDust()
	  {
		  System.out.println("Most likely already has a layer of dust on it. Who uses futons anymore?");
	  }
	
	@Override
	public void makesBed() 
	{
		System.out.println("You don't even need to make the bed, it comes with padding and soft covering...if you're lucky.");
	}

	@Override
	public void washesSheets() 
	{
		System.out.println("No need to wash sheets either, just a blanket maybe.");
	}

}
