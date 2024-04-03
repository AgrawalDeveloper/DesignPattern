package SingletonDesign;

public class TesterDesign {
 
	private static TesterDesign ref;
	private static int i=0;
	private TesterDesign() {
		
	}
	
	//Lazy way to create singleton
	public static TesterDesign getInstance()
	{
		
		if(ref==null)
		{
			synchronized (TesterDesign.class) {
				return ref=new TesterDesign();
			}
		}
			
			
		
		return ref;
		
		
		
	}
}
