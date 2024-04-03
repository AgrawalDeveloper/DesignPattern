package SingletonDesign;

public class EagerDesignPattern {

	private static EagerDesignPattern ref=new EagerDesignPattern();
	private EagerDesignPattern() {
		// TODO Auto-generated constructor stub
	}
	
	public static EagerDesignPattern getInstance()
	{
		return ref;
	}
}
