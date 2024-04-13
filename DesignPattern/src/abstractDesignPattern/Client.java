package abstractDesignPattern;

public class Client {

	public static void main(String str[])
	{
		Employee emp1=AbstractEmployee.getEmployee(new WebDevFactory());
		System.out.println(emp1.getName());
		

		Employee emp2=AbstractEmployee.getEmployee(new AndriodDevFatcory());
		System.out.println(emp2.getName());
	}
}
