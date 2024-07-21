package view.iinterface.initial;

public class StringTestImpl implements StringTest {

	@Override
	public boolean isLowerCase(String text) {
		return true;
	}
	
	@Override
	public boolean isUpperCase(String text) {
		return false;
	}
}
