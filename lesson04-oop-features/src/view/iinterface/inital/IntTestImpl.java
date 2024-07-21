package view.iinterface.inital;

// Implementation class of interface
public class IntTestImpl implements IntTest {
	
	@Override
	public boolean test(int number) {
		System.out.println("IntTestImpl#test");
		return number > 0;
	}
}
