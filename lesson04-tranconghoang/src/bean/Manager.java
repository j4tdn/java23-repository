package bean;

public class Manager extends CompanyPersonnel {

	private String unitName;
	
	public Manager() {

	}
	
	public Manager(String name, String dateOfBirth, Double coefficientSalary, Double positionCoefficient, String unitName) {
		super(name, dateOfBirth, coefficientSalary, positionCoefficient);
		this.unitName = unitName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnit(String unitName) {
		this.unitName = unitName;
	}
	
	@Override
	public double calculateSalary() {
		return (getCoefficientSalary() + getPositionCoefficient()) * 2200000;
	}

	@Override
	public String toString() {
		return "Manager [name=" + getName() + ", dateOfBirth=" + getDateOfBirth() + ", coefficientSalary="
				+ getCoefficientSalary() + ", positionCoefficient=" + getPositionCoefficient() + ", unitName=" + getUnitName() + "]";
	}
}
