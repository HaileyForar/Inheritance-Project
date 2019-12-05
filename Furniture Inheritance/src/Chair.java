
public abstract class Chair extends Furniture
{
	public void supportsBody()
	 {
		 System.out.println("This is a great piece, it provides for all your relaxation needs");
	 }
	
	public void collectsDust()
	{
		System.out.println("Unfortunately sometimes chairs can collect quite a bit of dust if not used regularly!");
	}
	
	public abstract void holdsPerson();
	public abstract void moves();
	 
}
