package bean;

public class DepartmentHead extends People {
	private String unitName;
	
	public DepartmentHead() {
	}

	public DepartmentHead(String name, String dateOfBirth, Double salaryCoefficient, Double positionCoefficient,
			String unitName) {
		super(name, dateOfBirth, salaryCoefficient, positionCoefficient);
		this.unitName = unitName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	
	@Override
	public String toString() {
		return "DepartmentHead [name=" + getName() 
		+ ", dateOfBirth=" + getDateOfBirth() 
		+ ", salaryCoefficient=" + getSalaryCoefficient()
		+ ", positionCoefficient=" + getPositionCoefficient() 
		+ ", unitName=" + getUnitName() + "]";
	}

	@Override
	public Double calculateSalary() {
		return (getSalaryCoefficient() + getPositionCoefficient()) * 2200000;
	}

	
	
	
}
