package view.iinterface.inital;

public class IntTesstImpl implements IntTest {
	@Override
	public boolean test(int number) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public int doubleVal(int number) {
		// TODO Auto-generated method stub
		return IntTest.super.doubleVal(number);
	}
}
