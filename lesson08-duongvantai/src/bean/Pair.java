package bean;

public class Pair {

	private String value;
	private int startIndex;
	public Pair(String value, int startIndex) {
		super();
		this.value = value;
		this.startIndex = startIndex;
	}
	public static Pair of(String value, int stadtIndex) {
		return  new Pair(value,stadtIndex);
	}
	private Pair(String value, String stadtIndex) {
		this.value = value;
		this.startIndex = startIndex;
	}
	public String getValue() {
		return value;
	}
	
	public int getStartIndex() {
		return startIndex;
	}
	public String toString() {
		return "{" + value + "," + startIndex + "}";
	}

	

}
