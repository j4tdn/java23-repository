package bean;

public class CustomInt {
	public int value;
	
	public CustomInt(int Value) {
		this.value = Value;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
}
