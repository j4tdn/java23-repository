package bean;

public abstract class CompanyPersonnel {

	private String name;
	private String dateOfBirth;
	private Double coefficientSalary;
	private Double positionCoefficient;
	
	public CompanyPersonnel() {
		
	}

	public CompanyPersonnel(String name, String dateOfBirth, Double coefficientSalary, Double positionCoefficient) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientSalary = coefficientSalary;
		this.positionCoefficient = positionCoefficient;
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

	public Double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(Double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	public Double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(Double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	
	public abstract double calculateSalary();
		
	@Override
	public String toString() {
		return "CompanyPersonnel [name=" + name + ", dateOfBirth=" + dateOfBirth + ", coefficientSalary="
				+ coefficientSalary + ", positionCoefficient=" + positionCoefficient + "]";
	}
}
