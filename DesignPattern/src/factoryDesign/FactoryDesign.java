package factoryDesign;

public class FactoryDesign {
	
	public static Employee getInstance(String dev)
	{
		if(dev.trim().equalsIgnoreCase("Android"))
			return new AndroidDeveloper();
		else if(dev.trim().equalsIgnoreCase("Web"))
			return new WebDeveloper();
		else 
			return null;
	}

}
