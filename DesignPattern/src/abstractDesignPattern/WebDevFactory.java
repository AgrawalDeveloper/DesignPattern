package abstractDesignPattern;

public class WebDevFactory extends FactoryAbstractEmployee{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}
	 
	

}
