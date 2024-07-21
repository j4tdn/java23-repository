package bean;

public abstract class Attribute {

	private String name;
	private String dateOfBirth;
	private int salaryCoefficient;

	public Attribute() {

	}

	public Attribute(String name, String dateOfBirth, int salaryCoefficient) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salaryCoefficient = salaryCoefficient;
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

	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(int salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public abstract double calculateSalary();
	@Override
	public String toString() {
		return "Attribute [name=" + name + ", dateOfBirth=" + dateOfBirth + ", salaryCoefficient=" + salaryCoefficient
				+ "]";
	}
	
	
}
