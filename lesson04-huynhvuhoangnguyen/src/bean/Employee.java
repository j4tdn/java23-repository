package bean;

public abstract class Employee {

	private String name;
	private String dateOfBirth;
	private Double coefficientsSalary;
	
	public Employee() {
	}

	public Employee(String name, String dateOfBirth, Double coefficientsSalary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Double getSalaryCoefficients() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(Double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary=" + coefficientsSalary
				+ "]";
	}
	
	public abstract double calculateSalary();
	
	
}
