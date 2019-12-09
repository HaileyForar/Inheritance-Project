
public class BunkBed extends Bed
{
	String type = "Bunk-bed";
	int weight = 200;
	double price = 302.99;
	
	@Override
	  
	  public void supportsBody()
	  {
		  System.out.println("Offers the support for two with separate beds!");
	  }
	  
	@Override
	  public void collectsDust()
	  {
		  System.out.println("Most likely would not collect dust...unless you don't understand the purpose of this bed.");
	  }

	@Override
	public void makesBed() 
	{
		System.out.println("Of course this bed makes itself, who has time to make two beds?");
	}

	@Override
	public void washesSheets() 
	{
		System.out.println("Unfortunately it does not wash its own sheets.");
	}

}
