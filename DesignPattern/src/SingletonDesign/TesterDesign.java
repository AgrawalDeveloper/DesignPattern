package SingletonDesign;

public class TesterDesign {
 
	private static TesterDesign ref;
	private static int i=0;
	private TesterDesign() {
		//how to safe singleton pattern by Reflection API
		//Throw exception if the user trying to create new instance and breaking singleton pattern funtionality
		if(ref!=null)
		{
			throw new RuntimeException("you are breaking singleton pattern");
		}
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
