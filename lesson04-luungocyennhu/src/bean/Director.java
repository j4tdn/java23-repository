package bean;

public class Director extends People {

	public Director() {
	}
	
	public Director(String name, String dateOfBirth, Double salaryCoefficient, Double positionCoefficient) {
		super(name, dateOfBirth, salaryCoefficient, positionCoefficient);
	}

	@Override
	public Double calculateSalary() {
		return (getSalaryCoefficient() + getPositionCoefficient()) * 3000000;
	}
}
