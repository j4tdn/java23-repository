package view.iinterface.initial;

// Implementation class of interface
public class IntTestImpl implements IntTest{
	@Override
	public boolean test(int number) {
		return number > 0;
	}
}
