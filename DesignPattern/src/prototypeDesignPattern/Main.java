package prototypeDesignPattern;

public class Main {
	
	public  static void main (String str[]) throws InterruptedException
	{
		NetworkConnection network=new NetworkConnection();
		network.setIp("12.22.334.12");
		network.loadImportantData();
		
		System.out.println(network);
	    try {
	    	NetworkConnection network1=(NetworkConnection)network.clone();
	    	System.out.println(network1);
	    }
	catch(CloneNotSupportedException e)
	    {
		e.printStackTrace();
	    }
	
	}

}
