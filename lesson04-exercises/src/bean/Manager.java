package bean;

public class Manager extends Attribute {

	private int positionCoefficient;
	private String unit;

	public Manager() {

	}

	public Manager(String name, String dateOfBirth, int salaryCoefficient, int positionCoefficient, String unit) {
		super(name, dateOfBirth, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
		this.unit = unit;
	}

	public int getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(int positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
	@Override
	public double calculateSalary() {
		return (getSalaryCoefficient()+getPositionCoefficient())*2200000;
	}

	@Override
	public String toString() {
		return "Employee [name=" + getName() 
				+ ", dateOfBirth=" + getDateOfBirth() 
				+ ", salaryCoefficient=" + getSalaryCoefficient() 
		     	+ ", positionCoefficient=" + positionCoefficient 
				+ ", unit=" + unit + "]";
	}
	

}
