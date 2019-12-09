
public class FurnitureRunner 
{
	 public static void main(String[] args)
	 {
		 Furniture [] collection = new Furniture [6];
		 collection[0] = new Recliner();
		 collection[1] = new RockingChair();
		 collection[2] = new Stool();
		 collection[3] = new BunkBed();
		 collection[4] = new LoftBed();
		 collection[5] = new Futon();
		 
		 for(Furniture f : collection)
		 {
			f.supportsBody();
			f.collectsDust();
//			f.price;
			System.out.println();
		 }
	 }

}
