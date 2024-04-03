package SingletonDesign;

public class TesterDesign {
 
	private static TesterDesign ref;
	private static int i=0;
	private TesterDesign() {
		
	}
	
	//Lazy way to create singleton
	public static synchronized TesterDesign getInstance()
	{
		
		if(ref==null)
			return ref=new TesterDesign();
			
		
		return ref;
		
		
		
	}
}
