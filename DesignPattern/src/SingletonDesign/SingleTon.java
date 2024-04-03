package SingletonDesign;

public class SingleTon {

	public static void main(String str[])
	{
		TesterDesign test1=TesterDesign.getInstance();
		TesterDesign test2=TesterDesign.getInstance();
		TesterDesign test3=TesterDesign.getInstance();
		System.out.println("Hello");
		//System.out.println(test.getClass());
		System.out.println(TesterDesign.getInstance().hashCode());
		System.out.println(TesterDesign.getInstance().hashCode());
		System.out.println(TesterDesign.getInstance().hashCode());
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		System.out.println(test3.hashCode());
	}
}
