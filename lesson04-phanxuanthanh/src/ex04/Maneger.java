package ex04;

public class Maneger extends Staff {
	
	private int possitionCoefficient;
	private String UnitDepartment;
	

	public Maneger() {
	
	}


	public Maneger(String name, String dateOfBirth, float salaryCoefficient, int possitionCoefficient, String UnitDepartment) {
		super(name, dateOfBirth, salaryCoefficient);
		this.possitionCoefficient = possitionCoefficient;
		this.UnitDepartment = UnitDepartment;
	}


	public int getPossitionCoefficient() {
		return possitionCoefficient;
	}


	public void setPossitionCoefficient(int possitionCoefficient) {
		this.possitionCoefficient = possitionCoefficient;
	}


	public String getUnitDepartment() {
		return UnitDepartment;
	}


	public void setUnitDepartment(String unitDepartment) {
		UnitDepartment = unitDepartment;
	}
	
	@Override
	public String toString() {
		return "Trưởng phòng [Họ tên: " + getName() + ", Ngày sinh: " + getDateOfBirth() + ", Hệ số lương: "
				+ getSalaryCoefficient() + ", Hệ số chức vụ: " + getPossitionCoefficient() + ", Tên phòng ban: "
				+ getUnitDepartment() + "]";
	}
}
