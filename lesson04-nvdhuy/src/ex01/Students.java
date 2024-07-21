package ex01;

public class Students {
	private int id;
	private String name;
	private double DLT;
	private double DTT;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}
	

	public Students(int id, String name, double dLT, double dTT) {
		super();
		this.id = id;
		this.name = name;
		this.DLT = dLT;
		this.DTT = dTT;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDLT() {
		return DLT;
	}

	public void setDLT(double dLT) {
		this.DLT = dLT;
	}

	public double getDTT() {
		return DTT;
	}

	public void setDTT(double dTT) {
		this.DTT = dTT;
	}
	public double Avg () {
		return (DTT+DLT)/2;
	}

	@Override
	public String toString() {
		return "" + id + "  " + name + "  " + DLT + "  " + DTT + "  " + Avg() ;
	}
		
}
