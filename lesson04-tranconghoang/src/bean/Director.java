package bean;

public class Director extends CompanyPersonnel {

	public Director() {
		
	}
	
	public Director(String name, String dateOfBirth, Double coefficientSalary, Double positionCoefficient) {
		super(name, dateOfBirth, coefficientSalary, positionCoefficient);
	}

	@Override
	public double calculateSalary() {
		return (getCoefficientSalary() + getPositionCoefficient()) * 3000000;
	}

	@Override
	public String toString() {
		return "Director [name=" + getName() + ", dateOfBirth=" + getDateOfBirth() + ", coefficientSalary="
				+ getCoefficientSalary() + ", positionCoefficient=" + getPositionCoefficient() + "]";
	}
}
