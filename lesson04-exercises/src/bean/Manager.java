package bean;

public class Manager extends Employee{
	
	private Double positionCoefficient;
	private String departmentName;
	
	public Double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(Double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Manager() {
	}

	public Manager(String fullname, String birthDate, Double salaryCoefficient, Double positionCoefficient,
			String departmentName) {
		super(fullname, birthDate, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
		this.departmentName = departmentName;
	}

	@Override
	public Double calculateSalary() {
		double result = 0;
		result = (getSalaryCoefficient()+getPositionCoefficient())*2200000;
//		return super.calculateSalary();
		return result;
	}
	
	@Override
	public String toString() {
		return "Manage: [Fullname=" + getFullname() + ", BirthDate=" + getBirthDate() + ", getSalaryCoefficient=" + getSalaryCoefficient() + ", PositionCoefficient=" + getPositionCoefficient() + ", departmentName=" + getDepartmentName() + "]";
	}

	
}
