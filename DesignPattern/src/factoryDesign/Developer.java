package factoryDesign;

public class Developer {
	
	public static void main (String agr[])
	{
		Employee emp1=FactoryDesign.getInstance("Web");
		emp1.salary();
		System.out.println("Salary + " +emp1.salary());
		Employee emp2=FactoryDesign.getInstance("Android");
		emp2.salary();
		System.out.println("Salary + " +emp2.salary());
	}

}
