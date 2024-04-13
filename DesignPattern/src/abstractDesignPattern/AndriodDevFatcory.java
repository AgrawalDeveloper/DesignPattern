package abstractDesignPattern;

public class AndriodDevFatcory extends FactoryAbstractEmployee{

	
	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndriodDeveloper();
	}
}
