package ex04;

public class Employee extends Staff {
	private String unitDepartment;
	private String nameOfManeger;
	
	public Employee() {

	}

	public Employee(String name, String dateOfBirth, float salaryCoefficient, String unitDepartment, String nameOfManeger) {
		super(name, dateOfBirth, salaryCoefficient);
		this.unitDepartment = unitDepartment;
		this.nameOfManeger = nameOfManeger;
	}

	public String getUnitDepartment() {
		return unitDepartment;
	}

	public void setUnitDepartment(String unitDepartment) {
		this.unitDepartment = unitDepartment;
	}

	public String getNameOfManeger() {
		return nameOfManeger;
	}

	public void setNameOfManeger(String nameOfManeger) {
		this.nameOfManeger = nameOfManeger;
	}
	
	@Override
	public String toString() {
		return "Nhân viên [Họ tên: " + getName() + ", Ngày sinh: " + getDateOfBirth() + ", Hệ số lương: "
				+ getSalaryCoefficient() + ", Tên phòng ban: "
				+ unitDepartment + ", Trưởng phòng: "
						+ getNameOfManeger() + "]";
	}
}
