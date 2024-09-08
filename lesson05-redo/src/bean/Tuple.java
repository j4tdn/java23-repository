package bean;

public class Tuple {
	private int a; //value
	private int b; // amount
	
	public Tuple() {
		
	}

	public Tuple(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "("  + a + ", " + b + ")";
	}
	
}