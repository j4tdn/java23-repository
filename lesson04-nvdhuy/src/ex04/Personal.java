package ex04;

public class Personal {
	private String name;
	private String DOB;
	private double heSoLuong;
	
	public Personal() {
		// TODO Auto-generated constructor stub
	}

	public Personal(String name, String dOB, double heSoLuong) {
		super();
		this.name = name;
		this.DOB = dOB;
		this.heSoLuong = heSoLuong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	@Override
	public String toString() {
		return "Personal [name=" + name + ", DOB=" + DOB + ", heSoLuong=" + heSoLuong + "]";
	}
	
}
