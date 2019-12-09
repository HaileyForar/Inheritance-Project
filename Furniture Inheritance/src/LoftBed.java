
public class LoftBed extends Bed 
{
	String type = "Loft-bed";
	int weight = 220;
	double price = 150.00;
	
	@Override
	  
	  public void supportsBody()
	  {
		  System.out.println("Extremely supportive, possibly for even more than one person!");
	  }
	  
	@Override
	  public void collectsDust()
	  {
		  System.out.println("Hopefully you do not let this bed collect dust, because loft beds are the coolest.");
	  }

	@Override
	public void makesBed() 
	{
		System.out.println("This bed does not make itself unfortunately.");
	}

	@Override
	public void washesSheets() 
	{
		System.out.println("But of course, it washes its own sheets. At least you get one out of two!");
	}

}
