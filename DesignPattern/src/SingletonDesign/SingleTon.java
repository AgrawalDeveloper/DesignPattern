package SingletonDesign;

import java.lang.reflect.Constructor;

public class SingleTon {

	public static void main(String str[]) throws Exception
	{
		TesterDesign test1=TesterDesign.getInstance();
		TesterDesign test2=TesterDesign.getInstance();
		TesterDesign test3=TesterDesign.getInstance();
		
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		System.out.println(test3.hashCode());
		
		
		EagerDesignPattern test4=EagerDesignPattern.getInstance();
		EagerDesignPattern test5=EagerDesignPattern.getInstance();
		EagerDesignPattern test6=EagerDesignPattern.getInstance();
		
		System.out.println(test4.hashCode());
		System.out.println(test5.hashCode());
		System.out.println(test6.hashCode());
		
		//How to break singleton class
		//Get the constructor and store it in constructor class
		Constructor<TesterDesign> con= TesterDesign.class.getDeclaredConstructor();
		//change the accessibility as we are getting exception
		con.setAccessible(true);
		//get new instance using con
		TesterDesign tester= con.newInstance();
		
		System.out.println(tester.hashCode());
	}
}
