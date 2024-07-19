package bean;

public class Manager extends Employee {

	private double positionCoefficient;
	private String department;
	
	public Manager() {
	}
	
	public Manager(String name, String dateOfBirth, Double coefficientsSalary, double positionCoefficient, String department) {
		super(name, dateOfBirth, coefficientsSalary);
		this.positionCoefficient = positionCoefficient;
		this.department = department;
	}
	
	public double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public double calculateSalary() {
		return (getSalaryCoefficients() + positionCoefficient) * 2200000;
	}

	@Override
	public String toString() {
		return "Manager [name=" + getName() 
			+ ", dateOfBirth=" + getDateOfBirth() 
			+ ", coefficientsSalary=" + getSalaryCoefficients()
			+ ", positionCoefficient=" + positionCoefficient 
			+ ", department=" + department
			+ ", salary=" + calculateSalary() + "]";
	}
	
}