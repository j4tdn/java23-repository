package bean;

public class Employee extends People {

	private String unitName;
	private DepartmentHead departmentHead;
	
	public Employee() {
	}
	
	public Employee(String name, String dateOfBirth, Double salaryCoefficient,
			String unitName, DepartmentHead departmentHead) {
		super(name, dateOfBirth, salaryCoefficient, 0d);
		this.unitName = unitName;
		this.departmentHead = departmentHead;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public DepartmentHead getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(DepartmentHead departmentHead) {
		this.departmentHead = departmentHead;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + getName() 
		+ ", dateOfBirth=" + getDateOfBirth() 
		+ ", salaryCoefficient=" + getSalaryCoefficient()
		+ ", unitName=" + getUnitName() 
		+ ", departmentHead=" + getDepartmentHead() + "]";
	}

	@Override
	public Double calculateSalary() {
		return getSalaryCoefficient() * 1250000;
	}
}
