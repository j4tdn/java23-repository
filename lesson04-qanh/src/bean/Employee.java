package bean;

public class Employee {
	
	private String name;
	private String birthDate;
	private double salaryCoefficient;

	public Employee() {
	}

	public Employee(String name, String birthDate, double salaryCoefficient) {
		this.name = name;
		this.birthDate = birthDate;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return birthDate;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.birthDate = birthDate;
	}

	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	
    public double calculateSalary() {
        return 1;
    }

	@Override
	public String toString() {
		return "Name: " + name + ", birthDate: " + birthDate + ", salaryCoefficient: " + salaryCoefficient;
	}
    
}
