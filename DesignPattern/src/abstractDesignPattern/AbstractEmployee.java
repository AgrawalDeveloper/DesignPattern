package abstractDesignPattern;

public class AbstractEmployee {

	public static Employee  getEmployee(FactoryAbstractEmployee factory)
	{
		return factory.createEmployee();
	}
}
