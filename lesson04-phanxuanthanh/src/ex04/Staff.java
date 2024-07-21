package ex04;

public class Staff {
	private String Name;
	private String dateOfBirth;
	private float salaryCoefficient;
	
	public Staff() {
	}

	public Staff(String name, String dateOfBirth, float salaryCoefficient) {
		Name = name;
		this.dateOfBirth = dateOfBirth;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(float salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	
}
