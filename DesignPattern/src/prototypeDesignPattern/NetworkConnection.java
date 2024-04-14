package prototypeDesignPattern;

import java.util.ArrayList;

public class NetworkConnection implements Cloneable{

	private String ip;
	private String importantData;
	private ArrayList<String> list=new ArrayList<>();
	
	public NetworkConnection()
	{
		
	}
	public String getIp()
	{
		return this.ip;
	}

	public String getImportantData() {
		return importantData;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]";
	}
	public void loadImportantData() throws InterruptedException
	{
		this.importantData="Very very important data";
		list.add("amdocs.com");
		list.add("google.com");
		list.add("jp morgan.com");
		list.add("flipkkart.com");
		Thread.sleep(10000);
	}
	// Deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		NetworkConnection network =new NetworkConnection();
		return network;
	}
}

