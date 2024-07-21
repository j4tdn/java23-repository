package bean;

public class Employee {
	
	private String name;
	private String dateOfBirth;
	private double salaryCoefficient;

	public Employee() {
	}

	public Employee(String name, String dateOfBirth, double salaryCoefficient) {
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

	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	
    public double calculateSalary() {
        return 0;
    }

	@Override
	public String toString() {
		return "Name: " + name + ", dateOfBirth: " + dateOfBirth + ", salaryCoefficient: " + salaryCoefficient;
	}
    
}
