package bean;

public abstract class Employee {

	private String fullname;
	private String birthDate;
	private Double salaryCoefficient;
	
	public Employee() {
	}

	public Employee(String fullname, String birthDate, Double salaryCoefficient) {
		this.fullname = fullname;
		this.birthDate = birthDate;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(Double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	
	public abstract Double calculateSalary();

	@Override
	public String toString() {
		return "Employee [fullname=" + getFullname() + ", birthDate=" + getBirthDate() + ", salaryCoefficient="
				+ getSalaryCoefficient() + "]";
	}
}
