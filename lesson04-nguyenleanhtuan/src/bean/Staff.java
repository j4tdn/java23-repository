package bean;


public class Staff extends Employee {

	private String departmentName;
	private String manager ;
	
	public Staff() {
	}

	public Staff(String fullname, String birthDate, Double salaryCoefficient, String departmentName, String manage) {
		super(fullname, birthDate, salaryCoefficient);
		this.departmentName = departmentName;
		this.manager = manage;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manage) {
		this.manager = manage;
	}

	@Override
	public Double calculateSalary() {
		double result = 0;
		result = (getSalaryCoefficient())*1250000;
		return result;
	}
	
	@Override
	public String toString() {
		return "Staff: [Fullname=" + getFullname() + ", BirthDate=" + getBirthDate() + ", getSalaryCoefficient=" + getSalaryCoefficient() + ", PositionCoefficient=" + ", departmentName=" + getDepartmentName() + ", Manager=" + getManager() + "]";
	}
	
}
