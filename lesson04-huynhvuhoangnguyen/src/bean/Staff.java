
package bean;

public class Staff extends Employee {
	
	private String department;
	private Manager manager;
	
	public Staff() {
	}
	
	public Staff(String name, String dateOfBirth, Double coefficientsSalary,
			String department, Manager manager) {
		super(name, dateOfBirth, coefficientsSalary);
		this.department = department;
		this.manager = manager;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public double calculateSalary() {
		return getSalaryCoefficients() * 1250000;
	}

	@Override
	public String toString() {
		return "Staff [name=" + getName() 
			+ ", dateOfBirth=" + getDateOfBirth() 
			+ ", coefficientsSalary=" + getSalaryCoefficients()
			+ ", department=" + department
			+ ", manager=" + manager
			+ ", salary=" + calculateSalary() + "]";
	}
	
}
