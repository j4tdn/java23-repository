package view.iinterface.initial;

public class StringTestImpl implements StringTest{
	@Override
	public boolean isLower(String text) {
		return true;
	}
	@Override
	public boolean isUpper(String text) {
		return false;
	}
}
