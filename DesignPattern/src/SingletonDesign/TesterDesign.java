package SingletonDesign;

public class TesterDesign {
 
	private static TesterDesign ref;
	private static int i=0;
	private TesterDesign() {
		
	}
	
	//Lazy way to create singleton
	public static TesterDesign getInstance()
	{
		System.out.println(ref);
		if(ref==null)
		{
			
			System.out.println("value of i + " + i++ );
			return ref=new TesterDesign();
			
		}
		return ref;
		
		
		
	}
}
