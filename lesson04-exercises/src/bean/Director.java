package bean;

public class Director extends Employee {
	
	private Double positionCoefficient;
	
	public Director() {
	}

	public Director(String fullname, String birthDate, Double salaryCoefficient, Double positionCoefficient) {
		super(fullname, birthDate, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
	}

	public Double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(Double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	
	@Override
	public Double calculateSalary() {
		double result = 0;
		result = (getSalaryCoefficient() + getPositionCoefficient()) * 3000000;
		return result;
	}

	@Override
	public String toString() {
		return "Director: [Fullname=" + getFullname()
				+ ", BirthDate=" + getBirthDate() + ", SalaryCoefficient=" + getSalaryCoefficient() + ", positionCoefficient=" + getPositionCoefficient() +"]";
	}
}
