package view;

public class CustomInt {
	public int value;
	
	public CustomInt(int pValue) {
		this.value = pValue;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
}
