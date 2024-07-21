package view.iinterface.initial;

public class IntTestImpl implements IntTest{

	@Override
	public boolean test(int number) {
		System.out.println("Interface#test");
		return number > 0;
	}

	
	
}
