package view.iinterface.initial;

// Implementation class of interface
public class IntTestImpl implements IntTest {

	@Override
	public boolean test(int number) {
		System.out.println("ImplementationClass#test");
		return number > 0;
	}

}
