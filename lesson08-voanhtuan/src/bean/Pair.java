package bean;

public class Pair {

	private String value;
	private int startIndex;
	
	public static Pair of(String value, int startIndex) {
		return new Pair(value, startIndex);
	}
	
	private Pair(String value, int startIndex) {
		this.value = value;
		this.startIndex = startIndex;
	}

	public String getValue() {
		return value;
	}

	public int getStartIndex() {
		return startIndex;
	}
	
	@Override
	public String toString() {
		return "{'" + value + "'," + startIndex + "}";
	}
	
}
